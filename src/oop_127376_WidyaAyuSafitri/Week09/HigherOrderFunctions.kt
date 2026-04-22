package oop_127376_WidyaAyuSafitri.Week09

fun main() {
    val number = listOf(1,2,3,4,5,6,7,8)
    println("Original Data : $number")
    println("\n=== HOF: FILTER ===")
    val evens = number.filter { it % 2 == 0 }
    println("Evens only : $evens")

    println("\n=== HOF: MAP ===")
    val multiplied = evens.map { it * 10 }
    val asString = multiplied.map {"Rp ${it}k"}
    println("Multiplied: $multiplied")
    println("Formatted: $asString")
}