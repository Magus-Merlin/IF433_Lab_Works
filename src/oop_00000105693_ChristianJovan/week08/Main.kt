package oop_00000105693_ChristianJovan.week08

fun main(){
    println("======== TEST SAFE CALLS & ELVIS ========")
    val emptyOrder = Order(null,null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"

    println("Tujuan pengiriman : $destination")



}