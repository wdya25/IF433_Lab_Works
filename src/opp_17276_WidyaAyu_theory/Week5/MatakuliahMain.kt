package opp_17276_WidyaAyu_theory.Week5

fun main(){
    val listMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("banyak tipe matkul: ${listMatkul}");

    for (mku in listMatkul) {
        mku.set_matkul(3);

        //CARA PANGGIL METHODE BEDA UNTUK ALL ANAK KELAS
        if(mku is Wajib){
         mku.ada_seminar();
        }else if (mku is Elective){
            mku.ada_praktek();
        }

        // CARA2 panggil methode beda untuk all anak kelas
        when(mku) {
            is Wajib -> {
                print("Wajib dari when:");
                mku.ada_seminar();
            }
            is Elective -> {
                print("Wajib dari when:");
                mku.ada_praktek();
            }
        }
    }
}