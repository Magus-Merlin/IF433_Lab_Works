package oop_00000105693_ChristianJovan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}