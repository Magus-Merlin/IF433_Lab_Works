package oop_00000105693_ChristianJovan.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLamp = SmartDevice("Philips WiZ Living Room", category = "Lighting", isOnline = true).apply {
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("${it.name} berhasil ditambahkan ke list!")
    }


}