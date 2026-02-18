package oop_127376_WidyaAyuSafitri.week3

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        if (value < 0) {
            println("EROR: Gaji tidak bolehh negatif! diset ke 0.")
            field = 0
        } else {
            field = value
        }
    }
}