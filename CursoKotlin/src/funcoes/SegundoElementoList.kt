package funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this[1] else null

fun main() {
    val list = listOf("João", "Maria", "Pedro")
    println(list.secondOrNull())
}