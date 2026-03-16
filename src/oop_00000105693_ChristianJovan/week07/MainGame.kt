package oop_00000105693_ChristianJovan.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("--- TIP! Legendary weapon has a ${ItemRarity.LEGENDARY.dropChance}% drop rate! ---")

    val StarterSword = Weapon.forgeStarterSword()
    println("You got a weapon to start your journey!")
    println("- Name       : ${StarterSword.item.name}")
    println("- Durability : ${StarterSword.durability}")
    println("- Damage     : ${StarterSword.item.damage}")
    println("- Rarity     : ${StarterSword.item.rarity}")
}