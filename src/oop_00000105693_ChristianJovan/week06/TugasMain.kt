package oop_00000105693_ChristianJovan.week06

fun main(){
    val smartLamp = SmartLamp("Ruang Tamu", "SM001")
    val smartSpeaker = SmartSpeaker("Google Nest Dapur", "SS001")
    val smartCCTV = SmartCCTV("Ezviz Garasi", "SCCTV001")

    val hub = SmartHomeHub()

    println("=== MENAMBAHKAN DEVICE ===")
    hub.addDevice(smartLamp)
    hub.addDevice(smartSpeaker)
    hub.addDevice(smartCCTV)

    println("\n=== MENYALAKAN SECURITY ===")
    hub.activateSecurityMode()

    println("\n=== MEMATIKAN DEVICE ===")
    hub.turnOffAllSwitches()
}