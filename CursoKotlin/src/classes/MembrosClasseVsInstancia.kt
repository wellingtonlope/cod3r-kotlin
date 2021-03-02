package classes

class ItemDePedido(val nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic
        var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.9)
    val item2 = ItemDePedido("Liquidificador", 200.0)
    ItemDePedido.desconto = 0.1
    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}