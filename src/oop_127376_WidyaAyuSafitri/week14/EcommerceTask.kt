package oop_127376_WidyaAyuSafitri.week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String, finalPrice: Double)
}
interface PricingStrategy {
    fun calculate(price: Double): Double
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
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}
class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}
class SafeOrderProcessor(
    private val repository: OrderRepository,
    private val notifier: NotificationService,
    private val pricingStrategy: PricingStrategy
) {
    fun processOrder(itemName: String, basePrice: Double) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repository.saveOrder(itemName, finalPrice, pricingStrategy::class.simpleName ?: "UNKNOWN")
        notifier.sendNotification(itemName, finalPrice)
    }
}