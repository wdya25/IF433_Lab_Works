package opp_17276_WidyaAyu_theory.Week6

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMK: String,
    override val nilaiMK: Int
) : Organisasi, KelasMK {
    override fun rapat(){
        println("sedang rapat di $namaOrg");
        println("Biaya konsum rapaat : ${super.biayaKonsumsi}"); // pakai super karena nagmbilnya di orang tua
    }

    override fun penilaian(){
        println("Nilai $namaMK adalah $nilaiMK");
    }

    override fun keaktifan(){
        super<KelasMK>.keaktifan();
        super<Organisasi>.keaktifan();
    }
}