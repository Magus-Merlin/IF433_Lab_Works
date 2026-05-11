package oop_00000105693_ChristianJovan.week12

fun main() {
    println("=== TEST RUN CATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse {-1}
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover {0}.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}