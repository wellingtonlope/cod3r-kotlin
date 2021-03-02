package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário escolar", 21.9),
    Produto("Lápis de cor", 11.9),
    Produto("Borracha bicolor", 0.7),
    Produto("Apontador com depósito", 1.8)
)

fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$ ${precoTotal / materialEscolar.size}.")
}