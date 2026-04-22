package opp_17276_WidyaAyu_theory.Week9

fun main(){
    println("===============List OF imut ==========")
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

    println("=========== set of imut=========");
    val arNilai = setOf(80,90,75,85,80,30,50,85); // dia kaya kalau ada yang dobel akan dihilangkan
    println("banyak nilai : ${arNilai.size}"); // kenapa 6 karena kalau dobel kebaca 1kali
    println("ada, angka 90 gak ? ${arNilai.contains(90)}");
    println(arNilai);
}