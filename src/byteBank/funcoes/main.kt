package byteBank.funcoes

import byteBank.classes.*

fun main() {

    val endereco = Endereco(logradouro = "Rua PG")
    val enderecoNovo = Endereco(numero = 222)
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
}
