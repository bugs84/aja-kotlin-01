package cz.vondr.aja.a_priklady

import kotlin.random.Random

fun main() {
    val anoNe = Random.nextBoolean()

    if (anoNe) {
        println("Anooooooooo")
    } else {
        println("Neeeeeeeeee")
    }

    if (anoNe) {
        println("Pouze Ano")
    }
}