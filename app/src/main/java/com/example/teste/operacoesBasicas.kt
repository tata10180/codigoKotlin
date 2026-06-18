package com.example.teste

fun main(){
    println("calcule: Somente realizamos soma, divisao, resto de divisao, incremento e decremento pos e pre, sair")
    var decisao = readln()
    println("Quais os valores das suas duas variaveis?")
    var x = readln().toInt()
    var y = readln().toInt()
    while (decisao != "sair"){
    if (decisao == "soma"){
         println(x + y)
    }else if(decisao == "divisao"){
        println(x / y)
    } else if(decisao == "resto"){
        println(x % y)
    } else if(decisao == "incremento pos"){
        println(x++)
        println(y++)
    } else if(decisao == "incremento pre"){
        println(++x)
        println(++y)
    } else if(decisao == "decremento pos"){
        println(x--)
        println(y--)
    } else if(decisao == "decremento pre"){
        println(--x)
        println(--y)
    }else{
        println("valor indevido")
    }
        println("digite outra operaçao:  soma, divisao, resto de divisao, incremento e decremento pos e pre, sair")
        decisao = readln()
        x = readln().toInt()
        y = readln().toInt()
    }
}