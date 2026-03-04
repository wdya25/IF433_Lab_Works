package oop_127376_WidyaAyuSafitri.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}