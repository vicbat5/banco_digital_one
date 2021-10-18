package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val victor = Pessoa(nome ="victor oliveira", cpf="123.123.123.12")
    println(victor.nome)
    println(victor.cpf)

    val Joao = Funcionario("victor", "testecpf", BigDecimal.valueOf(200.22))
}