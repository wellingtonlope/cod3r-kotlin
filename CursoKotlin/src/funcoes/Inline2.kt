package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val resultado = executarComLog("somar") {
        somar(4, 5) // last item is returned
    }

    println(resultado)
}