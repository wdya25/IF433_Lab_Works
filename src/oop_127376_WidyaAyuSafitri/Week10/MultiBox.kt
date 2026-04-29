package oop_127376_WidyaAyuSafitri.Week10

class PairBox<K, V>(var key: K, val Value: V)

fun main (){
    println("\n===== TEST MULTIPLE PARAMETER ====")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Asset : ${itemPrice.key}, harga: ${itemPrice.Value} USD")
}