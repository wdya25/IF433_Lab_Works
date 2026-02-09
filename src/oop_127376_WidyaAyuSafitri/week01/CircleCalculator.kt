package oop_127376_WidyaAyuSafitri.week01

fun main () {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius
    println("Radius: $radius , Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100 ) "this is a Big circle" else "this is a Small circle"