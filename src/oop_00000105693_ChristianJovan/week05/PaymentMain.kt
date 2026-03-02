package oop_00000105693_ChristianJovan.week05

fun main(){
    val EWallet = EWallet("OVO",50000.0)
    val CreditCard = CreditCard("VISA",100000.0)

    val listPayment: List<PaymentMethod> = listOf(EWallet, CreditCard)

    for (payment in listPayment){
        println("=== ${payment.accountName} ===")
        payment.processPayment(75000.0)

        when (payment){
            is EWallet -> {
                println("=== INITIATING TOP UP ===")
                payment.topUp(50000.0)
                println("=== PROCESSING PAYMENT ===")
                payment.processPayment(75000.0)
            }
        }
        println("----------------------------")
    }
}