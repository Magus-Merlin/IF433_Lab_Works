package oop_00000105693_ChristianJovan.week04

open class Developer(name: String, baseSalary: Int, val programmingLanguage : String) : Employee(name, baseSalary) {

    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

}