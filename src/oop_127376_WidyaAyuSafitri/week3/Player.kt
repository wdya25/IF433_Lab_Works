package oop_127376_WidyaAyuSafitri.week3

class Player(
    val username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus positif!")
            return
        }

        val currentLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > currentLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}