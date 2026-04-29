package opp_17276_WidyaAyu_theory.Week10

import opp_17276_WidyaAyu_theory.Week8.Alamat

//code non- generic
class rumah (val alamat: Any)

/// code generic
class kampus<T>(val alamat: T);

//code generic - multi parameter
class Komputer<T,V>(val merk: T, val barcode:V ) // pakai t dua duanya bolhe

//code generic - funtion
fun <T> Password(isiPass:T):T {
    return isiPass;
}

fun main() { // INI BUAT IMPLEMENTASINYA
    println("====== generic funtion =======")
    println("passsowrd kamu: " + Password(isiPass = 1234))

    println("===== generic multi parameter===");
    val komp = Komputer(merk= " Dell", barcode = 12345);
    println("Merk komputer :" + komp.merk)
    println("barcode komputer  :${komp.barcode}")

    println("===== SAMPLE NON-GENERIC=======");
    val rmh = rumah(alamat = 200);
    val angkaRumah = rmh.alamat as Int
    println(rmh.alamat + 50)

    println("===== SAMPLE GENERIC ======");
    val kmps = kampus(alamat = 300);
    println(kmps.alamat + 50)
}