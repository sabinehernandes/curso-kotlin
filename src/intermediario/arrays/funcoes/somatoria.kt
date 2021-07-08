package intermediario.arrays.funcoes

import java.math.BigDecimal


fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor

    }
}