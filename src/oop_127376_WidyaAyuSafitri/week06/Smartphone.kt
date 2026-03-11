package oop_127376_WidyaAyuSafitri.week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println(" sistem operasi smartphone berhasil booting.")
    }
}