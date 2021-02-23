package Tests

import bankdigital.brasil.example.Cliente
import bankdigital.brasil.example.ClienteTipo
fun main(){

    val josue=Cliente(
        nome="Lucy Rosane",
        cpf="12121564561515121",
    clienteTipo = ClienteTipo.pf,
        senha="123456"

    )
    println(josue)
    TesteAutentica().autenticacao(josue).toString()


}