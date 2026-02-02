package oop_00000105693_ChristianJovan.week01

fun main() {
    val gameTitle = "Persona 4 Revival"
    val price = 699000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int) : Int {
    return when(price){
        in 0..50000 -> 0
        in 50001..100000 -> 10000
        in 100001..300000 -> 30000
        in 300001..600000 -> 60000
        else -> 90000
    }
}

