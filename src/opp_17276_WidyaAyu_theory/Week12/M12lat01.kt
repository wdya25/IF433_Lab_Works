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

fun main (){
    //panggil class Custom Exception Classes
    val nsiswa = input_nilai_siswa(kkm = 70)
    nsiswa.input_nilai(nilaiKamu = 71)

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