package opp_17276_WidyaAyu_theory.` week4`

class Pasta:Makanan() {
    private var toping:String = "";
    public fun pasta_terjual(jml: Int) {
        this.toping = "nori";
        super.harga =jml * 120;
        println("Pasta $toping laris $harga");
    }

    override fun jual_makanan() {
        println("saya jual pasta enak");
    }
}