package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "1000".toBigDecimal(),
        "3000".toBigDecimal(),
        "3500".toBigDecimal()
    )
    println(salarios.somatoria())
    println("")
    println(salarios.media())
}