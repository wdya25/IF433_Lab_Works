package oop_127376_WidyaAyuSafitri.Week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 2.45))
    coinRepo.add(Coin("ETH", 15.7))
    coinRepo.add(Coin("USDT", 1250.0))
    println("Coin Repository berhasil diinisialisasi!")
    println("Jumlah koin saat ini: ${coinRepo.getAll().size}")

    println("\nDaftar Koin di Wallet:")
    coinRepo.getAll().forEach { coin ->
        println("• ${coin.name} : ${coin.balance}")
    }
}