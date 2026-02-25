package oop_127376_WidyaAyuSafitri.` week04`

open class vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("$brand melaju. kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}