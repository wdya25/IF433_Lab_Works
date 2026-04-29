package opp_17276_WidyaAyu_theory.Week10

import opp_17276_WidyaAyu_theory.Week8.Alamat

//code non
class rumah (val alamat: Any)

/// code generic
class kampus<T>(val alamat: T);

fun main() {
    println("===== SAMPLE NONGENERIC=======");
    val rmh = rumah(alamat = "gading serpong");
    println(rmh.alamat)

    println("===== SAMPLE GENERIC ======");
    val kmps = kampus(alamat = "Tangerang");
    println(kmps.alamat)
}