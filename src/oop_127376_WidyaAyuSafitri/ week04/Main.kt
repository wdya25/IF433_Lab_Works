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

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Employee ---")
    val manager = Manager(name = "karina", baseSalary = 10000000)
    println("Manager: ${manager.name}")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    val developer = Developer(name = "haland", baseSalary = 8000000, programmingLanguage = "Kotlin")
    println("Developer: ${developer.name}")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}