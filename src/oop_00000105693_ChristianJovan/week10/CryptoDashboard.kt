package oop_00000105693_ChristianJovan.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 75000.0))
    coinRepo.add(Coin("ETH", 55000.0))
    coinRepo.add(Coin("USDT", 65000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    println("\n=== STATUS ===")
    response.data.forEach {
        println("${it.name} - ${it.balance}")
    }

}