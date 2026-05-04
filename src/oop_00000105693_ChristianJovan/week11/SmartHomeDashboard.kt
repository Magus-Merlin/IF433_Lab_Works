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

    val acInverter  = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 900)
    }
    homeDevices.add(acInverter)

    val autoFeeder = run{
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    }
    homeDevices.add(autoFeeder)

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }?.let{
        println(it.diagnose())
    }

    with(homeDevices){
        println("Total perangkat di rumah : ${this.size}")

        this.forEach{
            println("- ${it.name}")
        }
    }

}