package byteBank.classes

class ContaSalario(
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
        println("Não é possível realizar uma transferência de conta salário para quaisquer outras contas")
    }
}