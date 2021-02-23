package bankdigital.brasil.example

class Cliente (nome:String,
               cpf:String,
val clienteTipo: ClienteTipo,
val senha:String
):Pessoa(nome,cpf),Logavel {
    override fun login(): Boolean ="123436"== senha
    override fun toString(): String =
        "" +
                " Nome:$nome" +
                "" +
                " Cpf:$cpf" +
                "" +
                " Pessoa:${clienteTipo.descricao} " +
                ""


}