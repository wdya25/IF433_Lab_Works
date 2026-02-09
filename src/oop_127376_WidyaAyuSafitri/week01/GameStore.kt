package oop_127376_WidyaAyuSafitri.week01

fun main () {
    val gameTitle ="Dota 2"
    val price = 750000
    val finalPrice = calculateDiscount(price)
    val userNote: String? = null

    println("Game store: SteamKW")
    println("Price: $price")
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) price - (price * 20/100) else price - (price * 10 / 100)
fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("====== struk pembelian =======")
    println("Game: $title")
    println("Final Price: $finalPrice")

    val displayNote = note ?: "tidak ada catatan"
    println("Catatan: $displayNote")
}