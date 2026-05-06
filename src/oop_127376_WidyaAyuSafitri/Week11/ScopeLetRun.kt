package oop_127376_WidyaAyuSafitri.Week11

import jdk.internal.joptsimple.internal.Strings.isNullOrEmpty

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run{
        println("Memproses kata : ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi run : $result")
}