package opp_17276_WidyaAyu_theory.Week7

fun main (){
    println("server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi();

    Mahasiswa.nama="udin";
    val na: Int = Mahasiswa.set_nilai(uts=80, uas=100)
    println("niali ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "UMN")

    val dsn1 = Dosen(nama = "indah", nik = "12345", 2020);
    println(dsn1);
    val dsn2 = dsn1.copy(nama = "Budi", nik = "32154");
    println(dsn2);

    // cara ambil data satu satu -persatu field
    println("Nma dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

}