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
    val acUnit = "Daikin Inverter (Kabel 3x2.5)".run {
        SmartDevice(
            name = this,
            category = "HVAC",
            isOnline = false,
            powerLoad = 800
        )
    }
    homeDevices.add(acUnit)
    val petFeeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    homeDevices.add(petFeeder)
    println(" AC dan Auto Feeder berhasil dikonfigurasi")
    println("Lampu Philips WiZ berhasil dikonfigurasi dan ditambahkan")
    println("Jumlah perangkat saat ini: ${homeDevices.size}")
}