package oop_00000105693_ChristianJovan.week06

class SmartHomeHub(){
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("Menambahkan device ${device.name}")
    }

    fun turnOffAllSwitches() {
        for (device in devices){
            when(device){
                is Switchable ->{
                    device.turnOff()
                }
            }
        }
    }
}