package opp_17276_WidyaAyu_theory.Week6

class Mahasiswa(override val namaOrg: String) : Organisasi {
    override fun rapat(){
        println("sedang rapat di $namaOrg");
    }
}