package oop_00000105693_ChristianJovan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon{
            return Weapon(GameItem("Durandal", 30, ItemRarity.EPIC), 300)
        }
    }
}