package intermediario.listas.testes

import intermediario.listas.funcoes.Livro
import intermediario.listas.funcoes.Prateleira
import intermediario.listas.funcoes.imprimeComMarcadores
import listaDeLivros

fun main(){

    val prateleira = Prateleira("Literatura", listaDeLivros)

    val porAno = prateleira.organizaPorAno()
    val porAutor = prateleira.organizaPorAutor()

    porAno.imprimeComMarcadores()
    porAutor.imprimeComMarcadores()

}