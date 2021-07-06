package byteBank.classes

abstract class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

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

    abstract fun saca(valor: Double)

    abstract fun transfere(valor: Double, destino: Conta)


//    fun transfere(valor: Double, destino: Conta) {
//        if (saldo >= valor) {
//            saldo -= valor
//            println(
//                "A transferência no valor de R$ $valor foi realizada para ${destino.titular}. " +
//                        "O saldo da conta após a transferência é de R$ ${this.saldo} "
//            )
//        } else {
//            println(
//                "A transferência no valor de R$ $valor não foi efetuada. " +
//                        "O saldo é de R$ ${this.saldo}"
//            )
//        }
//
//    }
}
