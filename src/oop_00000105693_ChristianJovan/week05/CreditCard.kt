package oop_00000105693_ChristianJovan.week05

class CreditCard(nama : String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(nama) {
    override fun processPayment(amount: Double) {
        if (limit >= (usedAmount + amount)) {
            usedAmount += amount
            println("=== TRANSACTION SUCCESS ===")
            println("=== SALDO TERPAKAI : RP ${usedAmount.toString()} ===")

        } else{
            println("=== TRANSACTION DENIED ===")
        }
    }
}