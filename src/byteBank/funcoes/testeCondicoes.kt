package byteBank.funcoes

fun testeCondicoes(saldo: Double) {
        if (saldo > 0.0) {
            println("O saldo é positivo")
        } else if (saldo == 0.0) {
            println("O saldo é neutro")
        } else {
            println("O saldo é negativo")
        }

    when {
        saldo > 0 -> println("O saldo da conta é positivo")
        saldo == 0.0 -> println("O saldo da conta é neutro")
        else -> println("O saldo da conta é negativo")
    }

    }