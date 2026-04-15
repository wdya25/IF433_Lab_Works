package opp_17276_WidyaAyu_theory.Week8

fun main (){
    var nama:String?= null;

    try {
        println("nama kamu ${nama!!.uppercase()}");
    } catch(ex:Exception) { //sama aja kalau pakai NullPointerexception (handel hanya null sedangkan itu dia menghandel eror keseluruhan )
        println("errornya adalah  ${ex.message}");
    }
}