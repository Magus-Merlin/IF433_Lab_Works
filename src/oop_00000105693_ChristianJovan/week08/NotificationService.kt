package oop_00000105693_ChristianJovan.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke $emailAddress")
    }

    fun processUser(user : UserProfile){
        // sendEmail(user.email) // Ini akan error : type mismatch

        if (user.email != null){
            sendEmail(user.email)
        }else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}