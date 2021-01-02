package cz.vondr.aja.pokusy

import kotlin.random.Random

fun main() {
    var n = Random.nextInt(1, 11)
    var o = Random.nextInt(1, 11)
    print(n)
    print("+")
    print(o)
    print("=")
    println(n + o)
    println("konec")
}