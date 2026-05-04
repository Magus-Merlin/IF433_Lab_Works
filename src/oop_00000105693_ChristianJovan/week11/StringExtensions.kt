package oop_00000105693_ChristianJovan.week11

fun String.addGreeting(): String {
    return "Hello $this"
}

fun String.repeatTimes(n : Int): String {
    return this.repeat(n)
}