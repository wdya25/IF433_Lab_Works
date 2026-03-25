package oop_127376_WidyaAyuSafitri.Week07

class Weapon private constructor(val item: Item, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = Item("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = Item("Excalibur", 50, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }

    override fun toString(): String {
        return "Weapon(item=$item, durability=$durability)"
    }
}