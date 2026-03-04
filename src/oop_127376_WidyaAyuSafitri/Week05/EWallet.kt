package oop_127376_WidyaAyuSafitri.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName)  {
    override fun processPayment(amount: Double) {
        println("[$accountName] mencoba membayar sebesar Rp $amount menggunakan Ewalet")
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil! Sisa saldo: Rp $balance")
        } else {
            println("Saldo tidak cukup! Saldo Anda: Rp $balance")
        }
    }
    fun topUp(amount: Double) {
        println("[$accountName] melakukan top up sebesar Rp $amount")
        balance += amount
        println("Top up berhasil! Saldo sekarang: Rp $balance")
    }
}