package oop_127376_WidyaAyuSafitri.Week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )
    print("=== HONOR STUDENTS PIPELINE ===")

    val honorName = students
        .filter { student -> student.gpa == 3.5 }
        .sortedBy { it.name }
        .map { it.name.uppercase() }
    honorName.forEach { println("Honor: $it") }
}