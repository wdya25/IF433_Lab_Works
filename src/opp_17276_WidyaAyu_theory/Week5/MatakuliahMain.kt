package opp_17276_WidyaAyu_theory.Week5

fun main(){
    val listMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("banyak tipe matkul: ${listMatkul}");

    for (mku in listMatkul) {
        mku.set_matkul(3);
    }
}