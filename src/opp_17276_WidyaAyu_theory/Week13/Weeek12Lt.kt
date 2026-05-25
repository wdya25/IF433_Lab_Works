package opp_17276_WidyaAyu_theory.Week13
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class Mahasiswa(val nim: String, val nama: String, val deskripsi: String)

fun main() {
    println("==== cara 1 baca isi file ====")
    val file1 = File("src/opp_17276_WidyaAyu_theory/Week13/contohfile.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println("===== CARA 2 baca isi file ======")
    val contentsaya =file1.readLines()
    contentsaya.forEach { println(it) }

   println("\n\n=== Cara 3 Baca Isi File - BUFFERED READER ===")
    val file2 = BufferedReader(FileReader("src/opp_17276_WidyaAyu_theory/Week13/contohfile.txt"))
    var isiFile:String? = file2.readLine()
    while(isiFile != null) {
        print(isiFile)
        isiFile = file2.readLine()
    }
    file2.close()

    println("===== CARA 4 baca isi file - buffered reader  (ver use) ======")
    val file3 = File("src/opp_17276_WidyaAyu_theory/Week13/contohfile.txt").bufferedReader()
    file3.use{
        it.lineSequence()
            .filter{it.isNotEmpty()}
            .forEach{println(it)}
    }

    println("\n==== CARA 1 buat file====")
    val fileSaya= File("src/opp_17276_WidyaAyu_theory/Week13/contohfile.txt")
    fileSaya.writeText("saya suka ke pasar \nBeli buah dan sayuran ")
    fileSaya.appendText("\n untuk ayah dan ibu \nDan kakak adik")
    val listBelanjaan = listOf("ayam", "pisang", "beras")
    fileSaya.appendText("\n"+listBelanjaan.joinToString("\n"))
    fileSaya.printWriter().use {
        it.println("Saya kuliah di UMN")
        it.println("UMN Kampus bagus")
        it.println("Saya jurusan IF")
    }


}