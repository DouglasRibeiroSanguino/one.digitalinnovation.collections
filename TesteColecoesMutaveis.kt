package one.digitalinnovation.collections

fun main() {
    val Thiago = Funcionario("Thiago", 20500.0, "CLT")
    val Jeferson = Funcionario("Jeferson", 5000.0, "PJ")
    val Ana = Funcionario("Ana", 5000.0, "PJ")

    val Funcionarios = mutableListOf(Thiago, Jeferson) //lista mutavel sendo possivel alterar ela com add e remove
    Funcionarios.forEach { println(it) }
    println("")

    Funcionarios.add(Ana)
    Funcionarios.forEach { println(it) }
    println("")

    Funcionarios.remove(Thiago)
    Funcionarios.forEach { println(it) }
}


