package oop_127376_WidyaAyuSafitri.` week04`

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors)  {
    final override fun accelerate() {
        speed += 15
        println("$brand berakselerasi dalam sunyi. kapasitas baterai: $batteryCapacity% ")
    }
}