package oop_00000105693_ChristianJovan.week04

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}