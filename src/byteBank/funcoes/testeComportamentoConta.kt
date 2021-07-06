package byteBank.funcoes

import byteBank.classes.Conta
import byteBank.classes.ContaCorrente
import byteBank.classes.ContaPoupanca
import byteBank.classes.ContaSalario

fun testeComportamentoConta() {
    val contaSabine = ContaCorrente("Sabine Hernandes", 1001)
    contaSabine.deposita(100.0)

    val contaEmily = ContaPoupanca("Emily Durães", 1002)
    contaEmily.deposita(-200.0)

    val contaPamela = ContaSalario("Pâmela Garcia", 1003)
    contaPamela.deposita(1000.0)

    contaEmily.deposita(200.0)
    contaEmily.saca(10.0)
    contaEmily.transfere(200.0, contaSabine)
    contaPamela.transfere(500.0, contaSabine)

    println("O saldo da conta da ${contaPamela.titular} é de R$ ${contaPamela.saldo} ")
}