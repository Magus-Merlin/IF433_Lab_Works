package oop_00000105693_ChristianJovan.week11

data class user(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = user().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}