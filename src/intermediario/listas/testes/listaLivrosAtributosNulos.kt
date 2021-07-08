package intermediario.listas.testes

import intermediario.listas.funcoes.Livro
import intermediario.listas.funcoes.listaLivrosAtributosNulos

fun main(){
    listaLivrosAtributosNulos.groupBy { it.editora ?: "Sem editora" }.forEach { (editora: String, livros: List<Livro>) ->
        println("$editora: ${livros.joinToString { it.titulo }}")
    }
}