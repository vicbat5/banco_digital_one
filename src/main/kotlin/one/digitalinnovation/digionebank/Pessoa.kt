package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Victor"
    var cpf:String = "123.123.123-12"

    /*inner class Endereco{//argumento interno
        var rua:String = "Rua teste"
    }*/
    constructor()

    fun uneNomeCpf() = "$nome e $cpf"
}

fun main(){
    val victor = Pessoa()

    println(victor.uneNomeCpf())
}