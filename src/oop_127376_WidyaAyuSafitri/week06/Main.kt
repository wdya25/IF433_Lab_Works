package oop_127376_WidyaAyuSafitri.week06

import jdk.jfr.DataAmount

fun processCheackout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount)
}
fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreaditCard()

    println("\n===  TESTING CHEACKOUT ==")
    processCheackout(method = pay1, amount = 50000.0)
    processCheackout(method = pay2, amount = 150000.0)

    val lampuRuangTamu = SmartLamp(
        id = "LMP-001",
        name = "Ruang Tamu"
    )

    val speakerDapur = SmartSpeaker(
        id = "SPK-002",
        name = "Google Nest Dapur"
    )

    val cctvGarasi = SmartCCTV(
        id = "CCTV-003",
        name = "Ezviz Garasi"
    )
    val hub = SmartHomeHub()
    hub.addDevice(lampuRuangTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

    println("\n=== Daftar Perangkat SmartHome ===")
    println("SmartLamp: ${lampuRuangTamu.name} (${lampuRuangTamu.id})")
    println("SmartSpeaker: ${speakerDapur.name} (${speakerDapur.id})")
    println("SmartCCTV: ${cctvGarasi.name} (${cctvGarasi.id})")
}
