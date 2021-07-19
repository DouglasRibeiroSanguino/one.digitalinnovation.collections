package one.digitalinnovation.collections

fun main() {
    val values = IntArray(6)
    values[0] = 10
    values[1] = 2
    values[2] = 30
    values[3] = 4
    values[4] = 50
    values[5] = 6

    for (valor in values){
        println(valor)
    }

    println("")

    values.forEach {
        println(it)
    }

    println("")

    values.sort()
    for (valor in values){
        println(valor)
    }
}
