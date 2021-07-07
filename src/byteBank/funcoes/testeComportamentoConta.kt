package byteBank.funcoes

import byteBank.classes.*

fun testeComportamentoConta() {

    val sabine = Cliente(nome = "Sabine", cpf = "000.000.000-00", senha = 123)

    val contaSabine = ContaCorrente(sabine, 1001)
    contaSabine.deposita(100.0)

    val emily = Cliente(nome = "Emily", cpf = "100.000.000-00", senha = 456)

    val contaEmily = ContaPoupanca(emily, 1002)
    contaEmily.deposita(-200.0)

    val pamela = Cliente(nome = "Pâmela", cpf = "200.000.000-00", senha = 789)

    val contaPamela = ContaSalario(pamela, 1003)
    contaPamela.deposita(1000.0)

    contaEmily.deposita(200.0)
    contaEmily.saca(10.0)
    contaEmily.transfere(200.0, contaSabine)
    contaPamela.transfere(500.0, contaSabine)

    println("O saldo da conta da ${contaPamela.titular} é de R$ ${contaPamela.saldo} ")
}