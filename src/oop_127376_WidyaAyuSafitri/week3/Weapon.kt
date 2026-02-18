package oop_127376_WidyaAyuSafitri.week3

class Weapon(
    val name: String
) {
    private var _damage: Int = 0
    var damage: Int
        get() = _damage
        set(value) {
            when {
                value < 0 -> {
                    println("EROR: Damage tidak boleh negatif! Nilai damage tetap $_damage")
                }
                value > 1000 -> {
                    println("Damage terlalu tinggi/overpowered, diset ke maksimum 1000")
                    _damage = 1000
                }
                else -> {
                    _damage = value
                }
            }
        }
    val tier: String
        get() = when {
            _damage > 800 -> "Legendary"
            _damage > 500 -> "Epic"
            else -> "Common"
        }
}