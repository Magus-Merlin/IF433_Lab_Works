package oop_00000105693_ChristianJovan.week06

class SmartSpeaker(override val name: String, override val id: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Menyalakan speaker $name ...")
    }

    override fun turnOff() {
        println("Mematikan speaker $name ...")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify.")
    }
}
