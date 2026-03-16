package oop_00000105693_ChristianJovan.week07

class NetworkClient private constructor(var url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}