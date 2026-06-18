package com.example.controleDeFluxo

/*
escreva um programa capaz de receber um texto e imprimi-lo invertido
entrada: Meu nome é Julius
saida: suiluJ é emon ueM
 */
fun inverso(str: String){
    var length = str.length
    while(length > 0){
        print(str[length - 1])
        length--
    }
}
fun main(){
    inverso("Meu nome e Julius")
}