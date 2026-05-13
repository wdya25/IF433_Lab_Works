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
        111
    }
    println("angka kamu adalah ${angka}")
}

fun main (){
    //Exception -expression
    cek_tipe_data()// harus ada agar bisa jalan
    pembagian (pembilang = 10, penyebut = 0)
}