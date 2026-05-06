package opp_17276_WidyaAyu_theory.Week11

// funtion biasa
fun panggil_nama (nama: String) : String {
    return "Hai $nama";
}

/// funtion extension  funtiaon -basic
fun String.panggil_Mahasiswa () : String {
    return "hello $this"
}
fun main(){
    //cara panggil funtion biasa
    println(panggil_nama("Toni "));

    /// cara panggil funtion extension -basic
    println("tonyy".panggil_Mahasiswa())
}