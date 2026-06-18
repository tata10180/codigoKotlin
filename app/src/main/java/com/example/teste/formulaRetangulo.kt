package com.example.teste
fun formula(x: Double, y: Double): Double{
    return x * y
}
fun main(){
    val retangulo = formula(10.5,20.0)
    println("A area do retangulo é $retangulo")

    val x: Double = 10.5
    val y: Double = 20.0
    println("A area do retangulo é ${x*y}")

}