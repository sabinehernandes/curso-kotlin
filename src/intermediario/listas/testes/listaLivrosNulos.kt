package intermediario.listas.testes

import intermediario.listas.funcoes.Livro


val listaLivrosNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        anoPublicacao = 1956,
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        anoPublicacao = 1881,
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865
    )
)