package oop_00000105693_ChristianJovan.week09

fun main(){
    println("=== TEST LAMBDA ===")
    val sumLambda = {a:Int, b:Int -> a+b}
    println("Hasil Sum : ${sumLambda(5,10)}")

    val squareImplicti: (Int) -> Int = {it * it}
    println("Hasil Square : ${squareImplicti(4)}")

}