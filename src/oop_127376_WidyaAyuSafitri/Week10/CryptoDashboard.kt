package oop_127376_WidyaAyuSafitri.Week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 2.45))
    coinRepo.add(Coin("ETH", 15.7))
    coinRepo.add(Coin("USDT", 1250.0))
    println("Coin Repository berhasil diinisialisasi!")
    println("Jumlah koin saat ini: ${coinRepo.getAll().size}")
    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("\n=== API Response ===")
    println("Status : ${response.status}")
    println("Total Koin: ${response.data.size}")
    println("Data yang diterima:")
    response.data.forEach { coin ->
        println("• ${coin.name} : ${coin.balance}")
    }
    println("Dashboard berhasil ditampilkan menggunakan generic list!")
}