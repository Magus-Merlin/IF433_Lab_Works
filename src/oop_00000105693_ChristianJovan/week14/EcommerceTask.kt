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

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
){
    fun processOrders(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when(customerType){
            "regular" -> basePrice
            "vip" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses Pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)

        notifier.sendNotification(itemName)

        println("--- Pesanan Selesai Diproses ---")
    }
}
