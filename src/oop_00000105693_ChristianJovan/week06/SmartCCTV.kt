package oop_00000105693_ChristianJovan.week06

class SmartCCTV(override val name: String, override val id: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("Menyalakan CCTV $name ...")
        startRecord()
    }

    override fun turnOff() {
        println("Mematikan CCTV $name ...")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam sekitar..")
    }

    override fun stopRecord() {
        super<Recordable>.stopRecord()
    }
}