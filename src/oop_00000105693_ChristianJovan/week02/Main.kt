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
}