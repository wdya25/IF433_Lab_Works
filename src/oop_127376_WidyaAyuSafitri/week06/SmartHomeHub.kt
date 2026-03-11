package oop_127376_WidyaAyuSafitri.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} ditambahkan ke hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== mematikan semua perangkat switchable ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
    fun activateSecurityMode() {
        println("\n=== MODUS KEAMANAN DIAKTIFKAN ===")
        for (device in devices) {
            when (device) {
                is Recordable -> {
                    device.startRecord()
                }

                is SmartSpeaker -> {
                    device.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}