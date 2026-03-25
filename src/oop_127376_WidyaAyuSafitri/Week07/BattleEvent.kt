package oop_127376_WidyaAyuSafitri.Week07

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: Item) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}