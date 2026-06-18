package com.example.funcExerc
/*
converter calcius em fahrenheit (f= (c * 9/5)/32
 */
fun conversaoF(c:Double){
    return println("A conversao de $c C é "+(((c*9)/5)+32) +" fahrenheit")
}
fun convsF(c:Double) = println("A conversao de $c C é "+(((c*9)/5)+32) +" fahrenheit")

fun main(){
    val resultado = conversaoF(readln().toDouble())
    val result = convsF(readln().toDouble())

}