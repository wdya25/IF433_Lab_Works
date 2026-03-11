package oop_127376_WidyaAyuSafitri.week06

import jdk.jfr.DataAmount

fun processCheackout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount)
}
fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreaditCard()

    println("\n===  TESTING CHEACKOUT ==")
    processCheackout(method = pay1, amount = 50000.0)
    processCheackout(method = pay2, amount = 150000.0)
}
