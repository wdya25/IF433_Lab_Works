package opp_17276_WidyaAyu_week2

class pemain  {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    //primary
    init {
        nama = "haland";
        println("ini adalah constructor");
    }

    //constructor
    constructor(alias: String="budi", kecepatan:Int=2){
        nama = alias;
        speed = kecepatan;
        println("ini adalah constructor kedua");
    }

    fun bawa_bola() {
        println("si $nama sedang bawa bola");
    }
}


fun main() {
    val player = pemain(alias = "yoel", kecepatan = 100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill pemain: ${player.speed}");

    //buat nambahin contoh
    val player2 = pemain(alias = "mu", kecepatan = 100);
    println("pemain populer: ${player2.nama}");
    println("kecepatan : ${player2.speed}");
}
