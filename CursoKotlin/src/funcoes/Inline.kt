package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    } finally {
        println("fechando transaçao...")
    }
}

fun main() {
    transacao {
        println("Execuntando SQL 1...")
        println("Execuntando SQL 2...")
        println("Execuntando SQL 3...")
    }
}