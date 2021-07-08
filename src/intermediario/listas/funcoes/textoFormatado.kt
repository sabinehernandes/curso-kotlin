package intermediario.listas.funcoes


fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this.filterNotNull().joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }
    println("### Lista de livros ### \n$textoFormatado")
}