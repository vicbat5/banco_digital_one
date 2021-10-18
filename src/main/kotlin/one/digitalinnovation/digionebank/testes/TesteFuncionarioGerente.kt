package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val maria = Gerente(nome ="Maria do Carmo", cpf="123.123.123.12", salario = 5000.0)
    //println(victor.nome)
    //println(victor.cpf)
    //println(victor.salario)

    imprimeRelatorio(maria)
}

//fun imprimeRelatorio (Funcionario:Funcionario) = println(Funcionario.toString())