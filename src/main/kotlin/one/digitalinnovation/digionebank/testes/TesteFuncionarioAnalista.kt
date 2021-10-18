package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val victor = Analista(nome ="victor oliveira", cpf="123.123.123.12", salario = 1000.0)
    //println(victor.nome)
    //println(victor.cpf)
    //println(victor.salario)

    imprimeRelatorio(victor)
}


fun imprimeRelatorio (Funcionario:Funcionario) = println(Funcionario.toString())