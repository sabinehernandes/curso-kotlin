package intermediario.arrays

fun main(){
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("A maior idade é de $maiorIdade anos")

    val menorIdade = idades.minOrNull()
    println("A menor idade é de $menorIdade anos")

    val media: Double = idades.average()
    println("A média das idades é de $media anos")

    val maiorDeIdade = idades.all{ it > 18 }
    println("Todos são maiores de idade? $maiorDeIdade")

    val umMaiorDeIdade = idades.any{ it >= 18}
    println("Há alguém maior de idade? $umMaiorDeIdade")

    val filtro = idades.filter { it >= 18 }
    println("Quais idades da array são maiores  ou igual a 18? $filtro")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca ")
}