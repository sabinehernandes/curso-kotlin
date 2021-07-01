package byteBank.classes

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println(
                "Depósito realizado no valor de R$ $valor" +
                        "O saldo após o depósito é de R$ ${this.saldo}"
            )
        } else {
            println("Não foi possível realizar o depósito")
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
            println(
                "Saque realizado no valor de R$ $valor. " +
                        "O saldo após o saque é de R$ ${this.saldo}"
            )
        } else {
            println(
                "O saque no valor de R$ $valor não foi efetuado. " +
                        "O saldo é de R$ ${this.saldo}"
            )
        }
    }

    fun transfere(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            println(
                "A transferência no valor de R$ $valor foi realizada para ${destino.titular}. " +
                        "O saldo da conta após a transferência é de R$ ${this.saldo} "
            )
        } else {
            println(
                "A transferência no valor de R$ $valor não foi efetuada. " +
                        "O saldo é de R$ ${this.saldo}"
            )
        }

    }
}
