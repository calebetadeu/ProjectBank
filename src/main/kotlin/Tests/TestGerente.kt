package Tests

import bankdigital.brasil.example.Gerente

fun main(){
    val Josue=Gerente(nome = "Josue Tadeu",cpf = "0655498421574", salario = 1542.6,senha = "senha")
    imprimeRelatorio(Josue)

    TesteAutentica().autenticacao(Josue)
}