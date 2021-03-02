package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstacia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Circlano"
    }

    fun fazer() {
        val local: Int = 7

        if(local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstacia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}