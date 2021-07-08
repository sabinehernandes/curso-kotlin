package intermediario.listas

import intermediario.listas.funcoes.Livro
import intermediario.listas.funcoes.imprimeComMarcadores

fun main() {
    val livro1 = Livro(
        anoPublicacao = 1956,
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        editora = "Editora A"
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        anoPublicacao = 1881,
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        editora = "Editora A"
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    //Ordenando a lista por título
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

}

