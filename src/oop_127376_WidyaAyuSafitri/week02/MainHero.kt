package oop_127376_WidyaAyuSafitri.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    var baseDamage = 0
    var inputValid = false

    while (!inputValid) {
        try {
            print("Masukkan base damage Hero (angka): ")
            baseDamage = scanner.nextInt()
            inputValid = true
        } catch (e: Exception) {
            println("Error: Harus masukkan ANGKA!")
            scanner.nextLine()
        }
    }
    scanner.nextLine()

    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100
    val enemyName = "Goblin"

    println("\n---PERTEMPURAN DIMULAI----")
    println("${hero.name} (HP: ${hero.hp}, DMG: ${hero.baseDamage}) vs $enemyName (HP: $enemyHp)")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- Giliran ${hero.name} ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        var choice = 0
        var pilihanValid = false

        while (!pilihanValid) {
            try {
                choice = scanner.nextInt()
                pilihanValid = true
            } catch (e: Exception) {
                println("Error: Harus masukkan ANGKA (1 atau 2)!")
                scanner.nextLine()
                print("Pilih aksi: ")
            }
        }
        scanner.nextLine()

        when (choice) {
            1 -> {
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("$enemyName menerima ${hero.baseDamage} damage! Sisa HP musuh: $enemyHp")

                if (enemyHp > 0) {
                    println("\n--- Giliran $enemyName ---")
                    val enemyDamage = (10..20).random()
                    println("$enemyName menyerang balik dengan damage $enemyDamage!")
                    hero.takeDamage(enemyDamage)
                }
            }
            2 -> {
                println("${hero.name} kabur dari pertempuran!")
                break
            }
            else -> {
                println("Pilihan tidak valid! Pilih 1 atau 2.")
            }
        }
    }

    println("\n---PERTEMPURAN SELESAI--")
    if (!hero.isAlive() && enemyHp <= 0) {
        println("Hasil SERI!")
    } else if (!hero.isAlive()) {
        println("$enemyName MENANG! Hero ${hero.name} telah gugur..")
    } else if (enemyHp <= 0) {
        println("${hero.name} MENANG! $enemyName telah dikalahkan!")
    } else {
        println("Pertempuran berakhir...")
    }
}