package oop_00000105693_ChristianJovan.week02

class Hero(
    val name : String,
    var hp : Int = 100,
    val baseDamage : Int,
){
    fun attack(targetName : String) {
        println("$name attacked $targetName!")
    }

    fun takeDamage(damage : Int) {
        println("-$damage HP")
        hp -= damage
        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive() : Boolean {
        return hp > 0
    }

}