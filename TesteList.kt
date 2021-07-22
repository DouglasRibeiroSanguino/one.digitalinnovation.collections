package one.digitalinnovation.collections

fun main() {
    val Thiago = Funcionario("Thiago", 20500.0, "CLT")
    val Jeferson = Funcionario("Jeferson", 5000.0, "PJ")
    val Funcionarios = listOf(Thiago, Jeferson)
    Funcionarios.forEach { println(it) }
    println("")
    Funcionarios.sortedBy { it.salario }.forEach { println(it) } //usado para ordernar
    println("")
    Funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) } //usado para ordernar o tipo de contratacao
}