package Tests
import bankdigital.brasil.example.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento->
        println("${elemento.name} - ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    val pf= ClienteTipo.pf
    val pj= ClienteTipo.pj
    println("${pf.name} >>>> ${pf.descricao}")
    print("${pj.name} >>>>>> ${pj.descricao}")
}