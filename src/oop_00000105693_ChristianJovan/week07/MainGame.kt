package oop_00000105693_ChristianJovan.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("--- TIP! Legendary weapon has a ${ItemRarity.LEGENDARY.dropChance}% drop rate! ---")

    val starterSword = Weapon.forgeStarterSword()
    println("You got a weapon to start your journey!")
    println("- Name       : ${starterSword.item.name}")
    println("- Durability : ${starterSword.durability}")
    println("- Damage     : ${starterSword.item.damage}")
    println("- Rarity     : ${starterSword.item.rarity}")

    println("Would you like to go to the forgery?(Press 1 to continue)")
    val choice = readln()

    val itemToLoot = starterSword.item

    when (choice) {
        "1"->{
            println("Welcome to the forgery!")
            println("As a gift, I will upgrade your sword!")

            val upgradedItem =  starterSword.item.copy(name = "Enhanced Sword", damage = 25)

            println("=== REFORGE SUCCESS! ===")
            println("- Name       : ${upgradedItem.name}")
            println("- Damage     : ${upgradedItem.damage}")
        }
        else -> return
    }

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(itemToLoot))
    processEvent(BattleState.GameOver("Terkena jebakan racun!"))
}