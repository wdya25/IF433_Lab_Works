package opp_17276_WidyaAyu_theory.Week8

class Alamat(val nomor: Int, val kota: String);
class Mahasiswa(val nim:String, val addr: Alamat?); // disini juga pakai ?

fun main () {
    val almt = Alamat(nomor = 47, kota = "Tangerang");
    val mhs = Mahasiswa(nim = "12345", addr = almt);

    val defaulAlamat = mhs.addr?.let { //letnya disini
       alamat -> "sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}";
    }?: "Gak jelas , ga tau dimana "

    println("Nimnya ${mhs.nim} tinggalnya di ${defaulAlamat}") // disinipakai ganti
}