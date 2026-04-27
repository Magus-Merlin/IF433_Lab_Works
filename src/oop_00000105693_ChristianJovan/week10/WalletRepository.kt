package oop_00000105693_ChristianJovan.week10

class WalletRepository<T>{
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll() : List<T> {
        return items
    }

    fun searchbByName(query: String): List<T> {
        return items.filter {
            if (it is Coin) {
                it.name.contains(query, ignoreCase = true)
            } else {
                false
            }
        }
    }

}