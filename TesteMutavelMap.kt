package one.digitalinnovation.collections

fun main() {
    val Thiago = Funcionario("Thiago", 20500.0, "CLT")
    val Jeferson = Funcionario("Jeferson", 5000.0, "PJ")
    val Ana = Funcionario("Ana", 5000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Thiago.nome, Thiago)
    repositorio.create(Jeferson.nome, Jeferson)
    repositorio.create(Ana.nome, Ana)
    println(repositorio.findById(Ana.nome))
    println("")

    repositorio.findAll().forEach { println(it) }
    println("")

    repositorio.remove(Ana.nome)
    repositorio.findAll().forEach { println(it) }
}