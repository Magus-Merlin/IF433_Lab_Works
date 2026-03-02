package oop_00000105693_ChristianJovan.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja(){
        println("[$nama] sedang duduk di depan komputer malayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}