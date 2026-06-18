package com.example.controleDeFluxo

/*
fizzBuzz imprima os numeros de 1 a 50 em ordem crescente de acordo com
a regra abaixo:
a. quando um numero for divisivel por 3, imprimir buzz
b. quando um numero for divisivel por 5, imprimir fizz
c. quando um numero for divisivel por 3 e 5, imprimir FizzBuzz
 */

fun main(){
    var x = 1
    while(x in 1..50){
        x++
        if(x % 3 == 0 && x % 5 == 0){
            println("FizzBuzz")
        } else if(x % 5 == 0){
            println("fizz")
        }else if(x % 3 == 0 ){
            println("buzz")
        }else{
            println(x)
        }
        //println(x)
    }
}