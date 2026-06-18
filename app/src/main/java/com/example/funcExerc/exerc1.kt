package com.example.funcExerc

/*
funcao capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
 obs pessoal: as vezes o jeito mais simples é a resposta, vou deixar os comentarios
 para depois ver como eu tava sendo otaria
 */
fun tempoEm(anos: Int/*, meses: Int, dias: Int, horas: Int, minutos: Int, segundos: Int*/){
    val meses = anos * 12
    //return meses, dias
    val dias = meses * 30
    //println("$meses")
    // return dias
    val horas = dias * 24
    //return horas
    val minutos = horas * 60
    //return minutos
    val segundos = minutos * 60
    //return segundos

    println("O $anos ano(s) corresponde a:")
    println("$meses meses,")
    println("$dias dias, ")
    println("$horas horas, ")
    println("$minutos minutos, ")
    println("$segundos segundos")
}
fun temp(ano: Int): Unit = println("O $ano corresponde a: "+ano*12+" meses "+ ((ano*12)*30) + " dias "+(((ano*12)*30)*24)+" horas "+((((ano*12)*30)*24)*60)+" minutos "+(((((ano*12)*30)*24)*60)*60)+" segundos")

fun main(){
    val resultado = tempoEm(2)
    val resultado2 = temp(2)



    //println("O resultado é $resultado")
}

