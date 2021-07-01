package byteBank

    fun main() {
        var titular = "Sabine"
        val numeroConta = 1000
        var saldo = 200.0
        saldo = 100.0
        saldo += 200

        println("O saldo da conta é de R$ $saldo")

        testeCondicoes(saldo)
    }

    fun testeCondicoes(saldo: Double) {
        if (saldo > 0.0) {
            println("O saldo é positivo")
        } else if (saldo == 0.0) {
            println("O saldo é neutro")
        } else {
            println("O saldo é negativo")
        }

    }
