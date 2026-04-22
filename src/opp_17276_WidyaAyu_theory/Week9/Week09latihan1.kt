package opp_17276_WidyaAyu_theory.Week9

fun main(){
    println("===============List OF==========")
    val arSiswa =listOf("budi", "Danu", "susi", "cica"); //gakwajib ar
    //view
    println(arSiswa); //bentuknya masih object -> array
    //panjang array
    println("banyak siswa: " + arSiswa.size);
    //munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}"); //karena [1]
    //munculin semua orang -> for each
    for (a in arSiswa) {
        println(" siswa " + a + " dan ");
    }

    println("==========list of mutable =======");
    val arMatkul = mutableListOf("OOP", "pemweb","matdis", "kalkulus" );
    arMatkul.add( "ALGO" ); // add
    arMatkul[2] = "Aljabar  Linear"; //buat edit atau ngubah
    arMatkul.remove(element = "pemweb "); //buat remove
    println(arMatkul);
}