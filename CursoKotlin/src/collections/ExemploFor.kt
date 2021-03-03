package collections

fun main() {
    val alunos = arrayListOf("Amanada", "André", "Bernado", "Carlos")

    for (aluno in alunos) {
        println(aluno)
    }

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}