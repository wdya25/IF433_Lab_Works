package oop_127376_WidyaAyuSafitri.` week04`

fun main(){
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle( brand = "seepeda onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Vehicle ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}