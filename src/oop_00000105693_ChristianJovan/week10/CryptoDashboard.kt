package oop_00000105693_ChristianJovan.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 75000.0))
    coinRepo.add(Coin("ETH", 55000.0))
    coinRepo.add(Coin("USDT", 65000.0))


}