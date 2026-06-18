package com.example.funcExerc

/*
func que recebe string e fala a qntd de caracteres
 */
fun qntd(palavra:String){
    println(palavra.length)
}
fun qntd1(palavra:String) = println(palavra.length)
fun main(){
    val resultado = qntd(readln())
    val resultado1 = qntd1("aberta")
}