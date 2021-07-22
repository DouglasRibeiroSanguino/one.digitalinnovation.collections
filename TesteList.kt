package one.digitalinnovation.collections

fun main() {
    val Thiago = Funcionario("Thiago", 2500.0)
    val Jeferson = Funcionario("Jeferson", 5000.0)
    val Funcionarios = listOf(Thiago, Jeferson)
    Funcionarios.forEach { println(it) }
}

data class Funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}
