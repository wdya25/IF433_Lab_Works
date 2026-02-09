package oop_127376_WidyaAyuSafitri.week01

fun main (args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius
    println("Radius: $radius , Area: $area")
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100 ) {
        println("this is a Big circle")
    } else {
        println("this is a Small circle")
    }
}