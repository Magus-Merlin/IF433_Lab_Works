package oop_00000105693_ChristianJovan.week12

fun main() {
    println("=== TEST RUN CATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}