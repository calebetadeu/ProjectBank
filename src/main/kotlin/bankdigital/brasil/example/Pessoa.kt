package bankdigital.brasil.example

class Pessoa {
    var nome:String="Calebe"
    var cpf:String="4552.544.6554-87"
    private set
    constructor()

    fun pessoainfo()="$nome, $cpf"
}
fun main(){
    val calebe=Pessoa()

  println(calebe.pessoainfo())
}