package oop_127376_WidyaAyuSafitri.Week12

fun main() {
    println("=== TEST RUNCATCHING ====")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}