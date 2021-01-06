package cz.vondr.aja.pokusy

fun main() {
    println("Jsi na rozcestí.")
    println("L [vlevo],  P [vpravo]")
    var d = readLine()
    if (d == "L") {
        println("máš poklad")
    } else {
        println("zabil tě drak")
    }
}