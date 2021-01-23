package cz.vondr.aja.pokusy

import kotlin.random.Random

fun main() {
    var cislo1 = Random.nextInt(1, 6)
    cislo1 = cislo1 * 10
    var cislo2 = Random.nextInt(1, 6)
    cislo2 = cislo2 * 10
    print(cislo1)
    print(" + ")
    println(cislo2)
    var cislo3 = readLine()!!.toInt()
    var vysledek = cislo1 + cislo2
    if(cislo3 == vysledek){
        println("SKVĚLÉ!")
    }else{
        println("ŠPATNĚ!")
    }
}