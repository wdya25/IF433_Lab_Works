package oop_127376_WidyaAyuSafitri.Week10

fun main (){
    println("\n===== TEST Constraints======")
    val math = MathBox(10.5,20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45,90)}")

    println("\n===== TEST GENERIC FUNTIONS  ====")
    printData(3.14)
    val result = processData ("Stable coin")
    printData("Hasil process: $result")

    println("===== TEST GENERIC Class ====")
    val intBox = Box(100)
    val stringBox = Box("Generic in kotlin")

    println(" isi intBox : ${intBox.value}")
    println("isi stringBox : ${stringBox.value}")
}