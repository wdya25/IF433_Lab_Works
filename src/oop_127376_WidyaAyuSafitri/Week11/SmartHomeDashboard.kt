package oop_127376_WidyaAyuSafitri.Week11

fun main() {
    println("=== SMART HOME DASHBOARD ===")
    val homeDevices = mutableListOf<SmartDevice>()
    println("Sistem Smart Home telah diinisialisasi")
    val livingRoomLight = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting"
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }
    println("Lampu Philips WiZ berhasil dikonfigurasi dan ditambahkan")
    println("Jumlah perangkat saat ini: ${homeDevices.size}")
}