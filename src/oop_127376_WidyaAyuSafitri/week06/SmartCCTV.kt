package oop_127376_WidyaAyuSafitri.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("CCTV $name ($id) menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name ($id) mati.")
    }

    override fun startRecord() {
        println("CCTV $name ($id) mulai merekam...")
    }

}