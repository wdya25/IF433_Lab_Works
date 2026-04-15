package oop_127376_WidyaAyuSafitri.Week08

fun main (){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak di ketahui"
    println("tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null,250000)
    val receipt = validOrder.totalPrice ?.let { price ->
        val tax =price * 0.11
        "transaksi valid. Harga:Rp$price, pajak: Rp$tax"
    }?: "Transaksi invalid: Harga belum di set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text= item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
    val someObject: Any = 100
    val safeString = someObject as? String?: "Unknown String"
    println("Hasil cast + falllback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
//    val toxicData: String? = null
//    try {
//        val length = toxicData!!.length
//    } catch (e: NullPointerException) {
//        println("carsh (NPE)! jangan gunakan !! secara sembarangan")
//    }
    val apiResponse: Map<String, String?> = mapOf("Status" to "200", "token" to null)
    try {
        val token = requireNotNull(apiResponse["Token"]){
            "CRITIKAL EXCEPTION: token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

