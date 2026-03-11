package opp_17276_WidyaAyu_theory.Week6

class Mahasiswa(override val namaOrg: String, override val budgetRapat: Int, override val jmlOrg: Int) : Organisasi {
    override fun rapat(){
        println("sedang rapat di $namaOrg");
        println("Biaya konsum rapaat : ${super.biayaKonsumsi}"); // pakai super karena nagmbilnya di orang tua
    }
}