package Tests

import bankdigital.brasil.example.Analista
import bankdigital.brasil.example.Funcionario

fun main(){
    val joao=Analista(nome = "Calebe",cpf = "06621353340",salario = 1545.5)
  imprimeRelatorio(joao)
}
fun imprimeRelatorio(funcinario:Funcionario)= println(funcinario.toString())