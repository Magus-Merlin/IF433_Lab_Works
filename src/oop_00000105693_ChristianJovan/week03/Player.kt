package oop_00000105693_ChristianJovan.week03

class Player(val username : String){
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXP(amount: Int) {
        if (amount < 1){
            println("XP is negative or zero")
            return
        } else{
            val prevLevel = level
            xp += amount

            if (level > prevLevel){
                println("Level up! Selamat $username naik ke level $level")
            }
        }
    }
}

