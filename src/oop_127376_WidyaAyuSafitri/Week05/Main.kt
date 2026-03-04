package oop_127376_WidyaAyuSafitri.Week05

fun main() {
    val dosen1 = Dosen(nama = "Pak alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=>Terdeteksi sebgai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagi admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------")
    }

    println("==== Tugas mandiri 1 ===")
    val mathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungluas(5)
    println("Luas persegi: $luasPersegi")
    val luasPersegiPanjang = mathHelper.hitungluas (8,4)
    println("Luas persegi Panjang: $luasPersegiPanjang")
    val luasLingkaran =mathHelper.hitungluas (7.0)
    println("Luas Lingkaran: $luasLingkaran")
}