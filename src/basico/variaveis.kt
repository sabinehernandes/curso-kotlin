package byteBank

fun main(){
    println("Bem-vinde ao byteBank! :)")

    //variáveis do tipo var são mutáveis
    var titular = "Sabine"
    titular = "Sabine Hernandes"

    //variáveis do tipo val são imutáveis, não é possível fazer a atribução abaixo
    val titular2 = "Emily"
    //titular2 = "Emily Durães"


    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("O titular da conta é $titular")
    println("O número da conta é $numeroConta")
    println("O saldo da conta é $saldo")

    when {
        saldo > 0 -> println("O saldo da conta é positivo")
        saldo == 0.0 -> println("O saldo da conta é neutro")
        else -> println("O saldo da conta é negativo")
    }

}