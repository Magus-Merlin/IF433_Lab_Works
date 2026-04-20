package oop_00000105693_ChristianJovan.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTC/SOL", "LONG", 10, 50.0, "OPEN"),
        TradeLog("DOGE/BTC",  "SHORT", 15, -25.5,  "CLOSED"),
        TradeLog("SOL/USDT",  "LONG",  20,  80.0,  "OPEN"),
        TradeLog("PEPE/USDT", "SHORT",  5, -60.0,  "CLOSED"),
        TradeLog("BTC/SOL",   "LONG",  25,  120.0, "OPEN"),
        TradeLog("DOGE/USDT", "SHORT", 10, -15.0,  "CLOSED"),
        TradeLog("PEPE/BTC",  "LONG",  30,  200.0, "OPEN"),
        TradeLog("SOL/DOGE",  "SHORT", 50, -100.0, "CLOSED")
    )

}