package oop_127376_WidyaAyuSafitri.Week08

fun main (){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak di ketahui"
    println("tujuan pengiriman: $destination")
}
