package intermediario.arrays

import intermediario.arrays.funcoes.bigDecimalArrayOf
import intermediario.arrays.funcoes.somatoria
import intermediario.arrays.funcoes.media
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.0", "10000.0")

    fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
            : BigDecimal {
        return if (salario < "5000".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    //Valor gasto com salários após o aumento
    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    //Valor gasto com salários após aumento + 6 meses
    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses)
    }
    println(gastoTotal)

    //Média dos três maiores salários
    val mediaMaiores = salariosComAumento.sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(mediaMaiores)
//    Equivale a:
//    val salariosOrdenados = salariosComAumento.sorted()
//    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
//    val media = tresUltimosSalarios.media()

    val mediaMenores = salariosComAumento.sorted().
    take(3).
    toTypedArray().
    media()
    println(mediaMenores)


}

