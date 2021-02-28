package funcamentos

import funcamentos.pacoteA.simplesFuncao as funcaoSimples
import funcamentos.pacoteA.Coisa
import funcamentos.pacoteA.FaceMoeda.CARA
import funcamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("Ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} ${substracao(4, 6)}")
}