package oop_00000105693_ChristianJovan.week03

class Weapon(val name: String){
    var damage: Int = 0
        set(value) {
            if (value < 0){
                println("ERROR: Damage dilarang negatif! Nilai lama dipertahankan.")
                return
            } else if (value > 1000){
                println("ERROR: Damage melebihi batas! Di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when{
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}