package opp_17276_WidyaAyu_theory.` week3`

 open class Bapake {
    private var nama:String = "haland";
    private var umur : Int = 35;
    protected var gaji: Int  =1000;

     public var uangjajan: Int = 0
     set(value) {
         if (value<0){
             println("masa uang jajan 0 atau minus")
         } else {
             field = value;
         }
     }
         get(){
             return field +1234;
         }

    public fun set_nama(namabaru:String) {
        if (this.nama.length <= 0) {
            println("Eh nama gak boleh kosng");
        } else {
            this.nama = namabaru;
        }
    }
    public fun get_nama():String {
        return this.nama;
    }

    public fun set_umur(umurbaru: Int) {
        if (this.umur > -5) {
            println("umur tidak boleh di bawah -5 yaw")
        } else {
            this.umur = umurbaru;
        }
    }
    public fun get_umur(): Int {
        return this.umur;
    }

} // CLOSE CLASS
class Anake: Bapake() {
    fun dapatin_gaji_bapak(): Int {
        this.gaji = 55000;
        return this.gaji;
    }
}


fun main() {
    var bpk = Bapake();
    bpk.set_nama("messie")
    bpk.set_umur(-4)
    println("nama papi kamu ${bpk.get_nama()} umurnya ${bpk.get_umur()}")

    var ank = Anake();
    println("nama papi kamu ${ank.get_nama()}");
    println("Gaji bapak :" + ank.dapatin_gaji_bapak())

    ank.uangjajan = -100;
}