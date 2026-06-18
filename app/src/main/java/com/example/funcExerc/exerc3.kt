package com.example.funcExerc

/*
fun que calcula o cubo de um numero
 */
fun cubo(n:Int){
    return println(n*n*n)
}
fun cubo1(n: Int) = println(n*n*n)
fun main(){
    val resultado = cubo(readln().toInt())
    val resultado1 = cubo1(readln().toInt())
}