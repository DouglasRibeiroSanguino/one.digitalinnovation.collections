package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(100.0, 2500.0, 2200.0)

    for (salario in salarios){
        println(salario)
    }

    println("O maior salário de hoje é " + salarios.max())
    println("O menor salário de hohe é " + salarios.min())
    println("A média de salários é de: " + salarios.average())

    println("")

    println("Os salários maiores que R$2000.0 são de:")
    val salariosmaiorque2k = salarios.filter { it > 2000.0 }
    salariosmaiorque2k.forEach { println(it) }
}