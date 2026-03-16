package oop_00000105693_ChristianJovan.week07

enum class ItemRarity (val dropChance: Int){
    COMMON(40),
    UNCOMMON(30),
    RARE(15),
    EPIC(10),
    LEGENDARY(5)
}

data class GameItem (val name: String, val damage: Int, val rarity: ItemRarity)

