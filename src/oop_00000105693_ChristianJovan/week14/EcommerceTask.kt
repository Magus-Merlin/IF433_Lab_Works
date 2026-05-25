package oop_00000105693_ChristianJovan.week14
import java.io.File

class BadOrderProcessor{
    private val file = File("orders.csv")

    fun processOrders(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")

    }

}

//Hasil yang benar
interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService{
    fun sendNotification(itemName: String)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository{
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        val file = File(filePath)
        file.bufferedWriter().use { writer ->
            writer.append("$itemName,$finalPrice,$customerType\n")
        }
    }
}

class EmailNotifier : NotificationService{
    override fun sendNotification(itemName: String) {
        println("Email terkirim:Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy{
    fun calculate(price:Double):Double
}

class RegularPricing(val customerType: String ="regular") : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing(val customerType: String ="vip") : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}


class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
){
    fun processOrders(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy, typeLabel: String) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses Pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, typeLabel)

        notifier.sendNotification(itemName)

        println("--- Pesanan Selesai Diproses ---\n")
    }
}

//Buat tes hasil
fun main() {
    val repo = CsvOrderRepository("orders.csv")
    val notifier = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(repo, notifier)

    println("=== SIMULASI EKSEKUSI SOLID ===")

    // Transaksi 1: Menggunakan strategi VIP
    val vipStrategy = VipPricing()
    orderProcessor.processOrders("Monitor ASUS", 3000000.0, vipStrategy, vipStrategy.customerType)

    // Transaksi 2: Menggunakan strategi Regular
    val regularStrategy = RegularPricing()
    orderProcessor.processOrders("Keyboard Mechanical", 800000.0, regularStrategy, regularStrategy.customerType)
}