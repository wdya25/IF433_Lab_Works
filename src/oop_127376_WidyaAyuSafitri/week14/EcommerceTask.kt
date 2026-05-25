package oop_127376_WidyaAyuSafitri.week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String, finalPrice: Double)
}
class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String, finalPrice: Double) {
        println("Email terkirim: Pesanan $itemName seharga Rp$finalPrice telah dikonfirmasi!")
    }
}
class SafeOrderProcessor(
    private val repository: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        repository.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName, finalPrice)
    }
}