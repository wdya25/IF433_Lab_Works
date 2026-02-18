package oop_127376_WidyaAyuSafitri.week3

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        println("Salary set gaji ke: $value")

        this.salary = value
    }
}