package opp_17276_WidyaAyu_theory.Week12

//basic exception - tryCatch
fun pembagian (pembilang: Int, penyebut: Int){
    try {
        val hasilBagi =pembilang/penyebut
        println("hasil bagi = $hasilBagi")
    } catch (e: Exception) {
        println("error di pembagian: ${e.message}")
    } finally { //finally mau dia eror atau tidak dia bakal di panggil
        println("selesai pembagian")
    }
}
//Exception - expression - tipe data
fun cek_tipe_data(){
    var angka:Int = try {
        Integer.parseInt( "10") // ini harus kasih angka kalau pakai huruf egak
    } catch (e: Exception) {
        println("ada error di Cek tipe data ${e.message}")
        111 // harus pakai angka jangan lupa
    }
    println("angka kamu adalah ${angka}")
}

//throw (untuk membuat eror)
fun cek_saldo(saldoSaya: Int){
    if (saldoSaya < 1000){
        throw IllegalArgumentException("saldo $saldoSaya tidak perlu bayar pajak")
    } else {
        println("selamat kamu orang kaya ")
    }
}

//Custom Exception Classes
class CekNilaiKkm (val kkm: Int, val nilai: Int): Exception("Nilai $nilai berada di bawah kkm $kkm")

class input_nilai_siswa(val kkm: Int){
    fun input_nilai(nilaiKamu : Int){ //fun gak boleh pakai val
        if (nilaiKamu < kkm){
            throw CekNilaiKkm(kkm, nilaiKamu)
        } else {
            println("kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}

// mulatiple catch
fun contoh_multiple_catch(nilai: String){
    try {
        val angka = Integer.parseInt( nilai)
        val hasil = angka/2
        println("nilai nilainya : $hasil")
        cek_saldo(100)
    } catch (e: NumberFormatException) {
        println("error salah format ${e.message}")
    }catch (e: ArithmeticException){
        println("error keslahan aritmatika  ${e.message}")
    }catch (e: Exception){
        println("error program:  ${e.message}")
    }
}
// Multiple catch Blocks
sealed class ATMException(pesan: String): Exception(pesan);
class saldo_dibawah_nol(val saldoKamu: Int):
    ATMException(pesan = "Masa Saldo $saldoKamu minus")
class cek_jumlah_saldo(val saldoAwal: Int, val jajan: Int):
        ATMException(pesan = "saldo tinggal $saldoAwal, kamu jajan $jajan, gak cukup")
fun mulai_jajan(saldoAwalKamu : Int, jajanKamu: Int): Int{
    if (saldoAwalKamu > jajanKamu){
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu)
    } else if (saldoAwalKamu < 0){
        throw saldo_dibawah_nol(saldoAwalKamu)
    }else {
        println("Transaksi berhasill")
    }
    return saldoAwalKamu - jajanKamu
}

fun main (){
    //panggil catch bloks
    runCatching { mulai_jajan(1000, 1000) } // runcatch sama kaya try
        .onSuccess { println("transaksi sukses : $it") } // ibarat di  bagian try{ '' disininya  dan sukses dia jalananin "return saldoAwalKamu - jajanKamu"
        .onFailure { println("transaksi gagal: $it") } // ini ibarat bagian catch nya


    contoh_multiple_catch("100")// buat si multiple catch
    //panggil class Custom Exception Classes
    val nsiswa = input_nilai_siswa(kkm = 70)
    try{
        nsiswa.input_nilai(nilaiKamu = 60)
    } catch (e: CekNilaiKkm){
        println("ada eroro saat input nilai ${e.message}")
    }

    // coba throw
    try {
        cek_saldo(saldoSaya = 990)
    } catch (e: Exception) {
        println("error di throw: ${e.message}") //pakai try catch untuk solusi dari eror
    }

    //Exception -expression
    cek_tipe_data()// harus ada agar bisa jalan
    pembagian (pembilang = 10, penyebut = 0)
}