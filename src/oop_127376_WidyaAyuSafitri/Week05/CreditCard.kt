package oop_127376_WidyaAyuSafitri.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        println("[$accountName] mencoba membayar sebesar Rp $amount menggunakan Credit Card...")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            val sisaLimit = limit - usedAmount
            println("Pembayaran berhasil! Total penggunaan: Rp $usedAmount, Sisa limit: Rp $sisaLimit")
        } else {
            println("Transaksi ditolak! Melebihi limit kredit!")
            println("Limit: Rp $limit, Penggunaan saat ini: Rp $usedAmount")
        }
    }
}