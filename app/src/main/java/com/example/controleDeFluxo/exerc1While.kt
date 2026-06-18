package com.example.controleDeFluxo

/*
considere uma caixa d'agua de 2 mil litros. romulo gostaria de encher
a caixa d'agua sem que o volume seja excedido - while
 */
fun main(){
    var caixa = 0
    var valor = 0
    while(caixa <= 2000){
        println("Digite um valor para add na caixa")
        valor = readln().toInt()
        caixa += valor
        if(caixa >2000) {
            println("O valor final $caixa esta acima do estipulado")
        }else{
            println("A caixa possui $caixa litros, você pode adicionar mais ${2000-caixa}")
        }

    }

}