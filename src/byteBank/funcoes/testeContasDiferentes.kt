package byteBank.funcoes

import byteBank.classes.Conta
import byteBank.classes.ContaCorrente
import byteBank.classes.ContaPoupanca

fun testeContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca("Fran", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    contaCorrente.transfere(100.0, contaPoupanca)
}