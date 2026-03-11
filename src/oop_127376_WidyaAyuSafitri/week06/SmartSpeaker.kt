package oop_127376_WidyaAyuSafitri.week06

class SmartSpeaker(
    override val id: String,
    override val name: String,
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker $name ($id) menyala.")
    }

    override fun turnOff() {
        println("Speaker $name ($id) mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}