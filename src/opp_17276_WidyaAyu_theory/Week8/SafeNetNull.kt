package opp_17276_WidyaAyu_theory.Week8

fun main (){
    var nama:String= "soobin";

    try {
        println("nama kamu ${nama.uppercase()}");
    } catch(ex:Exception) {
        println("errornya adalah  ${ex.message}");
    }
}