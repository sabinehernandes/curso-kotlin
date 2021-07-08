package intermediario.listas.funcoes

import listaDeLivros

class Prateleira (
    val genero: String,
    val livros: MutableList<Livro>,
) {
    //Lista mutável
    fun organizaPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    //Lista imutável
    fun organizaPorAno(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }

    }
}