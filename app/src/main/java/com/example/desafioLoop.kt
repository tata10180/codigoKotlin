package com.example

/*
Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a
pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao mês.
Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece
investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que investirão
5% do salário.
Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
 */
fun investimento():Double{
    var salario = 10000.0
    salario *= 0.05
    return salario

}
fun fundoEmpresa(): Double{
    var rendimentoMensal = investimento()
    rendimentoMensal *= 2.0
   // var rendimentoMensal = valor * 0.2
    return rendimentoMensal
}
fun fundoPessoal(): Double{
    val rendimentoMensal = investimento()
    //var rendimentoMensal = valor *0.8
    return rendimentoMensal

}
fun patrimonio(){
    var patrimonioAna = fundoEmpresa()
    var patrimonioPaula = fundoPessoal()
    var meses = 0
    while(patrimonioAna > patrimonioPaula){
        patrimonioAna *= 1.002
        patrimonioPaula *= 1.008
        meses += 1
    }
    println(patrimonioPaula)
    println(patrimonioAna)
    println("Leva $meses meses para o rendimento de Paula superar o de Ana")
}

fun main(){
    //val result =
      patrimonio()
    //println(result)
}
/*

 */