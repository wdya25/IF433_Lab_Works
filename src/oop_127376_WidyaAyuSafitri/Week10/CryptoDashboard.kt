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
        println("${coin.name} : ${coin.balance}")
    }
    println("=== TRANSACTION REPOSITORY ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("tx001", 0.05))
    txRepo.add(Transaction("tx002", 1.25))
    txRepo.add(Transaction("tx003", -0.3))
    txRepo.add(Transaction("tx004", 0.75))

    println("Transaction Repository berhasil diinisialisasi!")
    println("Jumlah transaksi: ${txRepo.getAll().size}")

    println("Daftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} Amount: ${tx.amount} BTC")
    }
    println("Dashboard berhasil ditampilkan menggunakan generic list!")
}