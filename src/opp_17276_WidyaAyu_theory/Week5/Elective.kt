package opp_17276_WidyaAyu_theory.Week5

class Elective: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Elective ${super.nama} sks $sks")
    }

    fun ada_praktek(){
        println("WAJIB Di praktekin")
    }

}