package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1850.0
    salarios[1] = 2500.0
    salarios[2] = 3500.0

    salarios.forEach { println(it) }

    println("")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("")

    val salarios2 = doubleArrayOf(1150.0, 2305.0, 6000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}

