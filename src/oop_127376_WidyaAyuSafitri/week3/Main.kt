package oop_127376_WidyaAyuSafitri.week3

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.interfacePerformanceRating()
    println("pajak yang harus dibayar : ${e.tax}")
}