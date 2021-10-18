package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
    nome:String,
    cpf: String,
    val salario:Double
    ) : Pessoa(nome, cpf) {
        protected abstract fun calculoauxilio():Double

    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        salario: $salario
        auxilio: ${calculoauxilio()}
    """.trimMargin()
}