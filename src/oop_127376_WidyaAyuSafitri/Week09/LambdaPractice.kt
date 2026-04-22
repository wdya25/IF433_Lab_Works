package oop_127376_WidyaAyuSafitri.Week09

fun main(){
    println("=== TEST LAMBDA ===")
    val  sumLambda = { a: Int, b: Int -> a + b}
    println("hasil sum: ${sumLambda(5, 10)}")

    val squareImplicit:(Int) -> Int = { it * it }
    println("hasil square: ${squareImplicit(4)}")
}