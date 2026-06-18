package com.example.funcExerc

/*
trocar todas as letras 'a', 'A' por x
uma funcao para ler string
uma funcao para troca de letra e impressao final
string final com letras minusculas
 */
fun ler(): String{
    return readln()
}
fun troca():Unit{
    val trocaPorX = ler().lowercase()
    return println(trocaPorX.replace("a", "x"))
}
fun main(){
    troca()

}