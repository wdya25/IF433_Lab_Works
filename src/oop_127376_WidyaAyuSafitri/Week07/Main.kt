package oop_127376_WidyaAyuSafitri.Week07

fun main () {
    println("=== TEST SINGLETON ===")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST SINGLETON ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("sama? ${reg1==reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = Datauser("Alice", 22)
    val data2 = Datauser("Alice", 22)
    println(data1)
    println("sama? ${data1==data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy :$data3")

    val(userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when(response){
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Data berhasil ditarik"
    }
    println(uiMessage)
}