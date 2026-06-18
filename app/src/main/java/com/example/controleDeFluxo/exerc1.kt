package com.example.controleDeFluxo

/*
escreva um programa para ajudar a empresa XPTO calcular o bonus que os
funcionarios receberao no final do ano. Os bonus sao classificados por cargo
a. gerente recebem 2000
b. coordenador 1500
c. engenheiros de software 1000
d. estagiario recebem 500
exerc 2, modifique para experiencia fazer dif
 */
fun bonus(cargo: String, experiencia: Int){ //rever nome dessa função
   // println("Digite um cargo e descubra o seu bonus")
    //while(cargo != "sair") {
        val message = if (cargo == "gerente" && experiencia < 2 ) "O bonus do $cargo com menos de 2 anos de experiencia é R$2000"
        else if (cargo == "gerente" && experiencia >= 2 ) "O bonus do $cargo com 2 ou mais anos de experiencia é R$3000"
        else if (cargo == "coordenador" && experiencia < 1) "O bonus do $cargo é R$1500"
        else if (cargo == "coordenador" && experiencia >=1) "O bonus do $cargo é R$1800"
        else if (cargo == "engenheiro de software") "O bonus do $cargo é R$1000"
        else if (cargo == "estagiario") "O bonus do $cargo é R$500"
        else "não existe informação sobre o bonus do cargo mencionado"
        println(message)
    //} else{
      //  println("stop") //voltar, e fazer uma funcao print e transformar ela no while,
    //nao e para usar o while e so para parecer que e 
    //}
}
fun main(){
    continuidade()
}
fun printar(){
    println("Digite um cargo (ex: gerente, coordenador, engenheiro de software ou estagiario)e a sua experiencia " +
            "nele, com isso descubra o seu bonus")
}
fun continuidade(){ //rever nome dessa função
    printar()
    bonus(readln().lowercase(),readln().toInt())
    println("Digite 's' se deseja continuar e 'n' se deseja parar")
    val continuar = readln().lowercase()
    if(continuar == "s"){
        continuidade()
    }else{
        println("Encerrado")
    }
}

//qundo startar a primeira vez, posso colocar um booleano no parametro de continuidade e colocar como default false e ai n precisa
//passar para outros passos e na main colocar true, se o valor for true, pode mostrar outra mensagem