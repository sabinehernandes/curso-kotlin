package byteBank

fun main() {
    println("Bem-vinde ao byteBank! :)")

    //Função com contagem regressiva
    //for (i in 5 downTo 1)

    //Função com contagem regressiva pulando de 2 em 2
    //for (i in 5 downTo 1 step 2)

    for (i in 1..5) {

        //Interrompe o laço de repetição quando chegar no item 4
        if(i == 5) {
            break
        }

        val titular = "Sabine $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("O titular da conta é $titular")
        println("O número da conta é $numeroConta")
        println("O saldo da conta é $saldo")

        when {
            saldo > 0 -> println("O saldo da conta é positivo")
            saldo == 0.0 -> println("O saldo da conta é neutro")
            else -> println("O saldo da conta é negativo")
        }
    }
}