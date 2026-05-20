package opp_17276_WidyaAyu_theory.Week13
import java.io.File

fun main() {
    println("==== cara 1 baca isi file ====")
    val file1 = File("src/opp_17276_WidyaAyu_theory/Week13/contohfile.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println("===== CARA 2 baca isi file ======")
    val contentsaya =file1.readLines()
    contentsaya.forEach { println(it) }
}