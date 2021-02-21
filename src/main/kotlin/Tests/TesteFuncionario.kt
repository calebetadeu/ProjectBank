package Tests

import bankdigital.brasil.example.Funcionario
import bankdigital.brasil.example.Pessoa
import java.math.BigDecimal

fun main(){
   // val calebe= Pessoa(nome = "Calebe", cpf = "06621353340")
    //println(calebe.nome)
  //  println(calebe.cpf)

    val joao= Funcionario(nome = "Calebe",cpf = "06621353340", BigDecimal.valueOf(1510))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}