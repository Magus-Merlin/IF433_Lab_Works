package oop_00000105693_ChristianJovan.week04

open class Employee (val name: String, val baseSalary: Int) {

    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        val bonus = baseSalary * 0.1
        return bonus.toInt()
    }

}