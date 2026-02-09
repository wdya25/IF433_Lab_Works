package oop_127376_WidyaAyuSafitri.week01

fun main () {
    val gameTitle ="Dota 2"
    val price = 750000
    val finalPrice = calculateDiscount(price)
    println("Game store: SteamKW")
    println("Game: $gameTitle")
    println("Price: $price")
    println("Final Price: $finalPrice")
}

fun calculateDiscount(price: Int) = if (price > 500000) price - (price * 20/100) else price - (price * 10 / 100)