package byteBank

fun main() {
    println("Bem-vinde ao byteBank! :)")

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