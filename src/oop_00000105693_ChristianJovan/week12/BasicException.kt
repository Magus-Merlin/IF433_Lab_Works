package oop_00000105693_ChristianJovan.week12

fun divide(a: Int, b: Int): Int {
    try{
        return a / b
    } catch(e: ArithmeticException){
        println("Error: ${e.message}")
        return -1
    } finally{
        println("Divison attempt finished")
    }
}