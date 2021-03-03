package collections

fun main() {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leando", "Gustavo")
    val uniao = numeros + strings // sobrecarga de operadores

    for (item in uniao) {
        println(item)
    }
}