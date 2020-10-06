package Aula10

class Funcionario (var nome: String, var numeroReg: Int){

}

fun main() {
    var listaDeFuncionarios= mutableListOf<Funcionario>()
    var funcionario1 = Funcionario(nome = "Maria", numeroReg = 57)
    var funcionario2 = Funcionario(nome = "Joao", numeroReg = 11)
    var funcionario3 = Funcionario(nome = "Matheus", numeroReg = 21)
    var funcionario4 = Funcionario(nome = "Edna", numeroReg = 12)
    var funcionario5 = Funcionario(nome = "Kelly", numeroReg = 12)

    listaDeFuncionarios.add(funcionario1)
    listaDeFuncionarios.add(funcionario2)
    listaDeFuncionarios.add(funcionario3)
    listaDeFuncionarios.add(funcionario4)

}