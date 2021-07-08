package intermediario.arrays

fun main(){
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    //Iteração para calcular o novo salário com aumento de 10%
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())

//Método 1:
//    var indice = 0
//    for(salario in salarios){
//        salarios[indice] = salario * aumento
//        indice++
//    }
//    println("Teste 1: ${salarios.contentToString()}")

//Método 2:
//    for(indice in salarios.indices){
//        salarios[indice] = salarios[indice] * aumento
//    }
//    println("Teste 2: ${salarios.contentToString()}")
}