package oop_00000105693_ChristianJovan.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("You have encountered ${event.monsterName}!")
            println("What will you do?\n1.Fight\nOther key = Run")
            println("Choice : ")
            val choice = readln()

            when(choice){
                "1" -> println("You fought against the ${event.monsterName}!")
                else -> println("You successfully fled from the ${event.monsterName}!")
            }
        }
        is BattleState.LootDropped -> {
            val (item) = event

            println("You got something from the loot!")
            println("Item : ${item.name}")
            println("Rarity : ${item.rarity}")
        }
        is BattleState.GameOver ->{
            println("=== GAME OVER ===\nReason : ${event.reason}")
        }
        BattleState.SafeZone -> println("You are in a Safe Zone, rest away before continuing your journey.")
    }
}