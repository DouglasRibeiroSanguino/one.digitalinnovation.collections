package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Thiago", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach { (n, v) -> println("Chave: $n - Valor: $v") }
    println("")

    val map2 = mapOf(
        "Jeferson" to 1250.0,
        "Ana" to 2500.0
    )
    map2.forEach { (n, v) -> println("Chave: $n - Valor: $v") }
}