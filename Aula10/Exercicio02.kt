package Aula10

class Coca (var tamanho: Int, var preco: Double){
    override fun equals(other: Any?): Boolean {
        return other?. let{it
            tamanho == (it as Coca). tamanho
        }?:false
    }
    }


fun main(){
    var coca1= Coca (tamanho= 500, preco = 8.0)
    var coca2= Coca (tamanho= 500, preco= 5.0)
    println (coca1 == coca2)
}