package opp_17276_WidyaAyu_theory.Week11

// funtion biasa
fun panggil_nama (nama: String) : String {
    return "Hai $nama";
}

/// funtion extension  funtiaon -basic
fun String.panggil_Mahasiswa () : String {
    //return "hello $this"
    val hasil = this.split("").joinToString(separator = ""){
        it.replaceFirstChar { c -> c.uppercase() }
    }
    return hasil
}
//fun extension -parameter
fun Int.tentukanLulus(nama: String) : String {
    var Keputusan =""
    if (this >= 70){
        Keputusan = "Lulus "
    } else {
        Keputusan = "Remedial "
    }
    return "Mahassiswa $nama hasil kelulusan adalah $Keputusan";
}
// fun extensiion -cek null
fun String?.cekNulldanEmpty(): String {
    if (this == null || this.isEmpty()){
        return "gak boleh null atau kosong bang "
    }else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa(){ // sCOPE-APPLY KALAU GAK PAKAI INI GAK BISA
    var nim : String? = "";
    var nama:String = "";
    var ipk:Int = 0;
}

fun main(){
    // cara panggil fun extension - null
    var inputUsername:String?=null
    println(inputUsername.cekNulldanEmpty());

    // cara panggil fun extention - parameter
    println(80.tentukanLulus(nama = "revan"));

    //cara panggil funtion biasa
    println(panggil_nama("Toni ").uppercase());

    /// cara panggil funtion extension -basic
    println("tonyy".panggil_Mahasiswa())

    //SCOPE -LET
    var kampusSaya = "UMN";
    kampusSaya.let {
        if (it == "UMN"){
            println("kampus " + it + "keren ")
        }else {
            println("amazing " + it)
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong ";
    alamatSaya.run {
        println("Saya tinggal di " + this)
    }

    ///SCOPE -WITH
    var gradesSaya = with(receiver = 90){
        if(this >= 80){
            "A"
        } else if (this >= 70){
            "B"
        } else {
            "C"
        }
    }
    println("Grade Kamu adlah $gradesSaya")

    //Scope - Apply
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345"
        nama = "yudi"
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}");

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68, 85);
    deretAngka.also{
        println("sebelum $deretAngka");
    } .add(90)
    println("setelah $deretAngka");

    //var coba ="udin"
    // println(coba.repeat(n = 10))// reapeat buat mempersingkat looping saja
}