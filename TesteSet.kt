package one.digitalinnovation.collections

fun main() {
    val Thiago = Funcionario("Thiago", 20500.0, "CLT")
    val Jeferson = Funcionario("Jeferson", 5000.0, "PJ")

    val funcionarios1 = setOf(Thiago)
    val funcionarios2 = setOf(Jeferson)
    val funcionarios3 = setOf(Thiago, Jeferson)

    val resultUnion = funcionarios1.union(funcionarios2) //usado para unir as litas de setOf
    resultUnion.forEach { println(it) }
    println("")

    val resultSubtract = funcionarios3.subtract(funcionarios2) //subtract usado para remover o que seja igual estando no conjunto 2
    resultSubtract.forEach { println(it) }
    println("")

    val resultIntersect = funcionarios3.intersect(funcionarios2) // intersect usado para mostrar o que há de igual
    resultIntersect.forEach { println(it) }
}

