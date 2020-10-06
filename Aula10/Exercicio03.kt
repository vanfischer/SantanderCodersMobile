package Aula10

class Aluno (var nome: String, var numero: Int){

}

fun main() {
    var listaDeAlunos= arrayListOf<Aluno>()
    var aluno1 = Aluno(nome = "Vanessa", numero = 147)
    var aluno2 = Aluno(nome = "Elias", numero = 148)
    var aluno3 = Aluno(nome = "Alice", numero = 558)
    var aluno4 = Aluno(nome = "Sofia", numero = 789)
    var aluno5 = Aluno(nome = "Estela", numero = 789)


    listaDeAlunos.add(aluno1)
    listaDeAlunos.add(aluno2)
    listaDeAlunos.add(aluno3)
    listaDeAlunos.add(aluno4)
    println (message = listaDeAlunos)
}
