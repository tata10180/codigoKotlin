package com.example.funcExerc
/*
recebe milhas e converte em km (milha = 1.6km)
 */
fun conversao(milhas:Double){
    return println("$milhas milhas em km é: "+milhas*1.6)
}
fun conversao1(milhas:Double) = println("$milhas milhas em km é: "+milhas*1.6)


fun main(){
    val resultado = conversao(readln().toDouble())
    val resultado1 = conversao1(readln().toDouble())
}