package oop_00000105693_ChristianJovan.week05

class EWallet(nama : String, var balance: Double) : PaymentMethod(nama)  {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("=== TRANSACTION SUCCESS ===")
            println("=== SALDO : RP ${balance} ===")
        } else{
            println("=== SALDO TIDAK CUKUP ===")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("=== SALDO : RP ${balance} ===")

    }
}