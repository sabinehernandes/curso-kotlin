package byteBank.funcoes

import byteBank.classes.*

fun testeContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(
            nome ="Alex",
            cpf ="111.111.111-11",
            senha = 222,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )

        ),
        numero = 1000
    )

    val fran = Cliente(nome = "Fran", cpf = "400.000.000-00", senha = 112)

    val contaPoupanca: Conta = ContaPoupanca(fran, 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Titular: ${contaCorrente.titular.nome}")
    println("CPF: ${contaCorrente.titular.cpf}")
    println("CPF: ${contaCorrente.titular.endereco.logradouro}")
}