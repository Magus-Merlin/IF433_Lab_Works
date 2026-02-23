package oop_00000105693_ChristianJovan.week04

fun main(){
    println("--- Testing Manager ---")
    val theManager = Manager("Kamoshida", 500000)
    theManager.work()
    println("${theManager.name} mendapatkan bonus sebanyak Rp.${theManager.calculateBonus()}!")

    println("\n--- Testing Developer ---")
    val theDeveloper = Developer("Mishima", 300000, "Java+")
    theDeveloper.work()
    println("${theDeveloper.name} mendapatkan bonus sebanyak Rp.${theDeveloper.calculateBonus()}!")
}