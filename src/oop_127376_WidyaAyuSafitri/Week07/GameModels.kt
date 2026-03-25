package oop_127376_WidyaAyuSafitri.Week07

enum class ItemRarity (val dropChance: Int) {
    COMMON(70),
    UNCOMMON(50),
    RARE(30),
    EPIC(10),
    LEGENDARY(1);
}
data class Item(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)