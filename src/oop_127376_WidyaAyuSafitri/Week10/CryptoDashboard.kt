package oop_127376_WidyaAyuSafitri.Week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    println("Coin Repository berhasil diinisialisasi!")
    println("Jumlah koin saat ini: ${coinRepo.getAll().size}")
}