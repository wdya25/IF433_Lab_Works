package opp_17276_WidyaAyu_theory.Week7

enum class MataKuliah (val jmlSks: Int){
    OOP (jmlSks = 3),
    GAMEDEV(jmlSks = 4),
    DASPRO (jmlSks = 2);

    fun sks_matkul(){
        println("jumlah sksnya : $jmlSks")
    }


}