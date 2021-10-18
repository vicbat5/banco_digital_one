package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome= "DigiOne",  12678)
    //na linha acima posso utilizar "nome=" para explicitar qual variavel estou atribuindo valor
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome="banco2")

    println(banco2.nome)
    println(banco2.numero)

    println(banco2.info())
}