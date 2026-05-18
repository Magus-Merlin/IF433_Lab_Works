package oop_00000105693_ChristianJovan.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")

    return try {
        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    }catch (e: NumberFormatException) {
        println("(Log) Data korup diabaikan: $line")
        return null
    }catch (e: IndexOutOfBoundsException){
        println("(Log) Data korup diabaikan: $line")
        return null
    }catch (e: Exception){
        println("(Log) Data korup diabaikan: $line")
        return null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use { out ->
        trades.forEach { trade ->
            out.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord>{
    return try {
        File(path).readLines().mapNotNull{ fromCsvTrade(it) }
    } catch(e: FileNotFoundException){
        println("Errror: File tidak ditemukan")
        emptyList()
    }
}