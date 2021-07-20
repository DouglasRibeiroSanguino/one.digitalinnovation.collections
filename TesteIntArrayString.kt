package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "P. Muniz"
    nomes[1] = "Carlos"
    nomes[2] = "Jeferson"

    nomes.forEach { println(it) }

    println("")

    nomes.sort()
    nomes.forEach { println(it) }

    println("")

    val nomes2 = arrayOf("João", "Tenor", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}