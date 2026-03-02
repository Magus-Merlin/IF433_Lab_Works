package oop_00000105693_ChristianJovan.week05

fun main(){
    val shape = MathHelper()

    println("=== HASIL PERHITUNGAN ===")
    println("Persegi dengan sisi 5cm memiliki luas ${shape.hitungLuas(5)}cm.")
    println("Persegi Panjang dengan panjang 5cm dan lebar 7cm memiliki luas ${shape.hitungLuas(5,7)}cm.")
    println("Lingkaran dengan jari-jari 5cm memiliki luas ${shape.hitungLuas(5.0)}cm².")
}