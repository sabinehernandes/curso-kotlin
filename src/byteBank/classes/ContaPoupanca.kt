package byteBank.classes

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
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

    override fun transfere(valor: Double, destino: Conta) {
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