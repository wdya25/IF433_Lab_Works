package oop_127376_WidyaAyuSafitri.week02

class Student (val name: String, val nim: String, var major: String
) {
    init {
        if (nim.length != nim.length) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $nim mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory")
        }
    }
}