package fundamentos.operadores

fun main() {
    val a = 1

    // Número para String
    println(a.toString() + 1)

    // String para número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}