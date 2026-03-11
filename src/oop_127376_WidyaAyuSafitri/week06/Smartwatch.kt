package oop_127376_WidyaAyuSafitri.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("layar OLED mneyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat hp di sekitar untuk pairing...")
    }

    override fun chargerBattery() {
        println("mengisi daya menggunakan charger magnetik 1SW.")
    }
}