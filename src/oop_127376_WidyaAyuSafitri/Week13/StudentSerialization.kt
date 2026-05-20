package oop_127376_WidyaAyuSafitri.Week13

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)
fun Student.toCSV(): String = "$name,$age,$gpa"
fun fromCSV(line: String): Student {
    val parts = line.split(",")
    return Student(
        name = parts[0],
        age = parts[1].toInt(),
        gpa = parts[2].toDouble()
    )
}
fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(
        students.joinToString(separator = "\n") { it.toCSV() }
    )
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCSV(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}