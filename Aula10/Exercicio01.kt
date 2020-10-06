package Aula10

class Pessoas(var nome: String, var RG: Int) {
    override fun equals(other: Any?): Boolean {
        return other?. let{it
        RG == (it as Pessoas). RG
        }?:false
    }
}
fun main() {
    var pessoa1 = Pessoas(nome = "Vanessa", RG = 337605312)
    var pessoa2 = Pessoas(nome = "Elias", RG = 337605312)
    println(pessoa1 == pessoa2)
}
