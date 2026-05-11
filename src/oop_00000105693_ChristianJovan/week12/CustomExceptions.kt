package oop_00000105693_ChristianJovan.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double,
) : Exception("Attempted $amount, balance: $balance")