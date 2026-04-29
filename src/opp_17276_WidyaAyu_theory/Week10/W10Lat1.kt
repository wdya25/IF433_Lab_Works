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

//code generic - funtion ada contraint(ini gabung fun dan classnya)
class kalkulator<T: Number> (val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

//generic - where
fun <T> penilaian(list : List<T>, kkm:T):List <T> where T: Comparable<T> {
    return list.filter { it>= kkm }
}

fun main() { // INI BUAT IMPLEMENTASINYA
    println("====== Generic Where ======")
    val daftarNilai = listOf(60,71,90,83, 73, 67,55,84,72)
    println("daftar nilai :" + daftarNilai)
    val nilaiAtasKkm = penilaian(daftarNilai, kkm=70)
    println("nilai diatas kkm : " + nilaiAtasKkm)

    println("====== Generic - constraint =====")
    val kalk = kalkulator(a=10.52, b=20.347);
    println("Penambahan  ${kalk.a} ditambah ${kalk.b}: " + kalk.tambah())
    println("Pengurngan  ${kalk.a} ditambah${kalk.b}: " + kalk.kurang())

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