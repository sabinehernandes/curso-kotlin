package byteBank.funcoes

import byteBank.classes.Conta

fun main() {
    println("Bem-vinde ao byteBank! :)")
    val contaSabine = Conta("Sabine Hernandes", 1001)
    contaSabine.deposita(100.0)

    val contaEmily = Conta("Emily Durães", 1002)
    contaEmily.deposita(-200.0)

    contaEmily.deposita(200.0)
    contaEmily.saca(10.0)
    contaEmily.transfere(200.0, contaSabine)

    println("O saldo da conta da ${contaEmily.titular} é de R$ ${contaEmily.saldo} ")

}

fun testeLacos() {
    var i = 0
    while (i <= 5) {

        val titular = "Sabine $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("O titular da conta é $titular")
        println("O número da conta é $numeroConta")
        println("O saldo da conta é $saldo")
        i++

    }
}
