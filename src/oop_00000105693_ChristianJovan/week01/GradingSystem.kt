package oop_00000105693_ChristianJovan.week01

fun main() {
    val name = "Jhon Thor"
    val score = 80

    println("Nama : $name , Score : $score")

    val grade = when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}