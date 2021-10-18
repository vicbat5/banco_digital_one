package one.digitalinnovation.digionebank

//como se trata de uma classe filha (no caso gerente é
// instancia da classe filha Funcionario) de um abstract
//o abstract forca a instancia

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoauxilio(): Double = salario * 0.4

}