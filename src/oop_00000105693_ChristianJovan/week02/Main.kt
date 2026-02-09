package oop_00000105693_ChristianJovan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR : Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1.Reguler, 2.Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1){
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    }else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    print("Pilih aplikasi yang ingin digunkan (1.PMB UMN, 2.UMN RPG): ")
    val app = scanner.nextInt()
    scanner.nextLine()

    if (app == 1){
        print("Masukkan Judul Buku: ")
        val bookTitle = scanner.nextLine()

        print("Masukkan Nama Peminjam: ")
        val borrower = scanner.nextLine()

        print("Masukkan Durasi Peminjaman (Hari): ")
        var loanDuration = scanner.nextInt()

        scanner.nextLine()

        if (loanDuration < 0){
            loanDuration = 1
        }

        val loan = Loan(bookTitle, borrower, loanDuration)

        println("--- DETAIL PEMINJAMAN ---")
        println("Judul Buku : ${loan.bookTitle}")
        println("Peminjaman : ${loan.borrower}")
        println("Durasi Peminjaman : ${loan.loanDuration}")
        println("Denda : ${loan.calculateFine()}")

    }else if(app == 2){

        print("Masukkan nama Hero   : ")
        val heroName = scanner.nextLine()

        print("Masukkan damage Hero : ")
        val baseDamage  = scanner.nextInt()

        val enemy = "Minotaur"
        var enemyHP = 120

        val hero = Hero(name = heroName, baseDamage = baseDamage)

        println("Enemy $enemy appeared!")
        while(hero.isAlive() && enemyHP > 0){
            println("1. Attack")
            println("2. Run")
            print("Choose: ")
            val choose = scanner.nextInt()

            if (choose == 1){
                hero.attack(targetName = enemy)
                val critical = (1..5).random()
                if (critical == 3) {
                    enemyHP -= baseDamage * 2
                    println("CRITICAL HIT!")
                }else{
                    enemyHP -= baseDamage
                }
                if (enemyHP > 0) {
                    println("$enemy remaining HP = $enemyHP")
                    println("The enemy counter attacks!")
                    hero.takeDamage((10..20).random())
                    println("Your remaining HP = ${hero.hp}")
                    if (hero.hp == 0){
                        println("You lose..")
                        println("Thanks for playing the game!")
                        break
                    }
                } else{
                    println("Congratulations, you have defeated the $enemy!")
                }
            }
            else if (choose == 2){
                println("You successfully ran from the battle!")
                break
            }else {
                println("Choose the option provided!")
            }
        }

    }else {
        println("Terimakasih!")
    }

}