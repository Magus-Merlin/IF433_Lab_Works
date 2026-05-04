package oop_00000105693_ChristianJovan.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLamp = SmartDevice("Philips WiZ Living Room", category = "Lighting", isOnline = true).apply {
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("${it.name} berhasil ditambahkan ke list!")
    }

    val smartCamera = SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

}