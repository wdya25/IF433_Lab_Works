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
fun main (){
    pembagian (pembilang = 10, penyebut = 0)
}