package byteBank.funcoes

import byteBank.classes.*

fun testeFuncionarios() {
    val sabine: Funcionario = Analista(
        nome = "Sabine",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${sabine.nome}")
    println("CPF: ${sabine.cpf}")
    println("Salário: R$ ${sabine.salario}")
    println("Bonificação: R$ ${sabine.bonificacao}")

    val emily: Gerente = Gerente(
        nome = "Emily",
        cpf = "222.222.222-22",
        salario = 5000.0,
        senha = 1234
    )

    println("Nome: ${emily.nome}")
    println("CPF: ${emily.cpf}")
    println("Salário: R$ ${emily.salario}")
    println("Bonificação: R$ ${emily.bonificacao}")

    emily.autentica(1224)

    val juliana: Diretor = Diretor(
        nome = "Juliana",
        cpf = "333.333.333-33",
        salario = 10000.0,
        senha = 4567,
        plr = 1000.0
    )

    println("Nome: ${juliana.nome}")
    println("CPF: ${juliana.cpf}")
    println("Salário: R$ ${juliana.salario}")
    println("Bonificação: R$ ${juliana.bonificacao}")

    juliana.autentica(4567)

    val maria: Funcionario = Analista("Maria", "000.000.000-00", 3000.0)
    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: R$ ${maria.salario}")
    println("Bonificação: R$ ${maria.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(sabine)
    calculadora.registra(emily)
    calculadora.registra(juliana)
    calculadora.registra(maria)

    println("O total da bonificação é de R$ ${calculadora.total}")
}