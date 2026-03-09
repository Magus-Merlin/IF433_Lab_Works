package oop_00000105693_ChristianJovan.week06

class SmartLamp(override val name: String, override val id: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Menyalakan lampu $name ...")
    }

    override fun turnOff() {
        println("Mematikan lampu $name ...")
    }
}