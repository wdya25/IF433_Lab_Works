package oop_127376_WidyaAyuSafitri.Week09

fun main(){
    println("===  TEST LIST ===")
    val frameworks: List<String> = listOf("kotlin", "java", "C++")
    println("immutable list : $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")
}