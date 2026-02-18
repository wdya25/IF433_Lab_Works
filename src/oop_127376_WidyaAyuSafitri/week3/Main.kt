package oop_127376_WidyaAyuSafitri.week3

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.interfacePerformanceRating()
    println("pajak yang harus dibayar : ${e.tax}")

    val weapon = Weapon("Dragon Slayer")
    println("Mencoba set damage -50:")
    weapon.damage = -50
    println("Damage saat ini: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
    println()
    println("Mencoba set damage 9999:")
    weapon.damage = 9999
    println("Damage saat ini: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    val player = Player("bappe")
    println("Username: ${player.username}")
    println("Level awal: ${player.level}")
    player.addXp(50)
    println("Level setelah addXp (50): ${player.level}")
    player.addXp(60)
    println("Level setelah addXp(60): ${player.level}")
}