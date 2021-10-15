package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{
        elemento -> println("${elemento.name} - ${elemento.descricao}")
        //elemento seria um nome escolhido pela aplicacao
    }

    ClienteTipo.values().forEach{
            println("${it.name} - ${it.descricao}")
        //ir seria um nome proprio da linguagem
    }

    val pf = ClienteTipo.PF
    println("chamando o obejto por enum ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("chamando o obejto por enum ${pj.name} - ${pj.descricao}")

}