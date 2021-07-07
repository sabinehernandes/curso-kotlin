package byteBank.funcoes

import byteBank.classes.*


fun testeObjects() {
    val alex = Cliente(nome = "Alex", cpf = "", endereco = Endereco(logradouro = "Rua X"), senha = 1)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaCorrente = ContaCorrente(alex, 1002)

    println("Total de contas: ${Conta.total}")

}
