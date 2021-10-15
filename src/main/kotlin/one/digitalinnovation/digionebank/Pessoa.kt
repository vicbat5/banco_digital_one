package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Victor"
    var cpf:String = "123.123.123-12"

    /*inner class Endereco{//argumento interno
        var rua:String = "Rua teste"
    }*/
}

fun main(){
    val victor = Pessoa()

    victor.cpf = "4572"//tendo acesso aos dados do objeto

    println(victor)
    println(victor.nome)
    println(victor.cpf)

    //println(victor.Endereco().rua)
}