package byteBank.funcoes

import byteBank.classes.Cliente
import byteBank.classes.Diretor
import byteBank.classes.Gerente
import byteBank.classes.SistemaInterno


fun testeAutenticacao() {
    val gerente = Gerente(
        nome = "Sabine",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Emily",
        cpf = "000.000.000-00",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Amanda",
        cpf = "555.555.555-55",
        senha = 4567
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 4467)

}