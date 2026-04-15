package oop_127376_WidyaAyuSafitri.Week08

fun main() {
    println("=== E-COMMERCE PROCESSING ===")
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                val desc = when (it) {
                    is Electronic -> "${it.name} (Warranty ${it.warrantyMonths})"
                    is Clothing   -> "${it.name} (Size ${it.size})"
                }
                println("Berhasil memproses: $desc")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Data korup: ${e.message}")
        }
    }
}