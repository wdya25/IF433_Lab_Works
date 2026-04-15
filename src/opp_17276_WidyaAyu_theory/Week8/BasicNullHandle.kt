package opp_17276_WidyaAyu_theory.Week8

import oop_127376_WidyaAyuSafitri.Week07.BattleState

class set_krs(var nim: String?, val kodematkul: String?){
    fun matkul_wajib(sks: Int?){
        println("matkul kamu $kodematkul sksnya adalah $sks");
    }
}


fun main () {
    var nama:String ? = "Widya";
    nama = null
    println("Hai $nama");

    val settingKRS = set_krs(nim="123", kodematkul = "null")
    println("Nim  kmau ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null);
}
