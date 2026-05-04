package oop_00000105693_ChristianJovan.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata : ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")
    //Saya ubah tempat test run function ke ScopeLetRun.kt dari Main.kt
}