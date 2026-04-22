package oop_127376_WidyaAyuSafitri.Week09

fun main() {
    val number = listOf(1,2,3,4,5,6,7,8)
    println("Original Data : $number")
    println("\n=== HOF: FILTER ===")
    val evens = number.filter { it % 2 == 0 }
    println("Evens only : $evens")
}