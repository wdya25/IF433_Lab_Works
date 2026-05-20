package oop_127376_WidyaAyuSafitri.Week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)
fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}
fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 245.5),
        TradeRecord(2, "ETHUSDT", "Short", 500.0, -45.2),
        TradeRecord(3, "SOLUSDT", "Long", 750.0, 132.8)
    )
    val filePath = "crypto_trades.csv"
    saveTrades(trades, filePath)
    println("Simulated trade records berhasil disimpan ke $filePath")
    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Malformed data injected for robustness test")
}