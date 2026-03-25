package oop_127376_WidyaAyuSafitri.Week07

fun main () {
    println("=== TEST SINGLETON ===")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST SINGLETON ===")
    val client = NetworkClient.createClient()
    client.connect()
}