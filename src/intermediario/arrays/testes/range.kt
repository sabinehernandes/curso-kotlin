package intermediario.arrays

fun main(){
    val serie: IntRange = 1.rangeTo(10)
    println("Contagem de 1 a 10: ")
    for (s in serie) {
        print("$s, ")
    }

    println()

    val numerosPares = 0..100 step 2
    println("Contagem de 0 a 100 em números pares: ")
    for(numeroPar in numerosPares) {
        print("$numeroPar, ")
    }

    println()

    val numerosPares2 = 2.until(100) step 2
    println("Contagem de 2 a 98 em números pares: ")
    for(numeroPar2 in numerosPares2) {
        print("$numeroPar2, ")
    }

    println()

    val regressao = 100 downTo 0 step 2
    println("Contagem regressiva de 100 a 0 em números pares: ")
    regressao.forEach { print("$it, ") }

    println()

    val intervaloSalarios = 1500.0..5000.0
    val salario = 5500.0
    if(salario in intervaloSalarios) {
        println("O salário de R$ $salario está dentro do intervalo especificado")
    } else {
        println("O salário de R$ $salario não está dentro do intervalo especificado")
    }

    println()

    val alfabeto = 'a'..'z'
    val letraMinusc = 'k'
    val letraMaiusc = 'K'
    //Retorna true
    println(letraMinusc in alfabeto)
    //Retorna false
    println(letraMaiusc in alfabeto)
}