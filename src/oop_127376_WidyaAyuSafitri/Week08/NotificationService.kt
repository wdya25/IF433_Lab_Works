package oop_127376_WidyaAyuSafitri.Week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("mengirim email ke $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("user ${user.email} tidak memiliki email.")
        }
    }
}