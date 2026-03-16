package oop_00000105693_ChristianJovan.week07

class NetworkClient private constructor(var url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangung NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect(){
        println("Connecting to $url...")
    }
}