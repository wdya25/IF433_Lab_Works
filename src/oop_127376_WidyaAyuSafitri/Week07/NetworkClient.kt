package oop_127376_WidyaAyuSafitri.Week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"
        fun createClient() : NetworkClient {
            println("Membangun networkClient dengan Base_URL: $BASE_URL")
            return NetworkClient($BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url....")
    }
}