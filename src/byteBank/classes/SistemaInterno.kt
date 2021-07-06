package byteBank.classes

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)) {
            println("Bem-vinde ao ByteBank")
        } else {
            println("Acesso negado")
        }

    }
}