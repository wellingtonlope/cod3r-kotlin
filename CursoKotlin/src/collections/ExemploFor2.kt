package collections

fun main() {
    val alunos = arrayListOf("Amanada", "André", "Bernado", "Carlos")
    alunos.forEach {
        println(it)
    }

    alunos.forEachIndexed { index, item ->
        println("${index + 1} - $item")
    }
}