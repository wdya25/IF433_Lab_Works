package oop_127376_WidyaAyuSafitri.week06

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {println("processing Rp$amount via gopay server")}
}

class CreaditCard : PaymentMethod {
    override fun pay(amount: Double) {println("Contacting bank for  Rp$amount ")}
}