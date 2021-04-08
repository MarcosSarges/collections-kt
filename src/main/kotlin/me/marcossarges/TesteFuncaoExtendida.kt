package me.marcossarges

fun main() {
    val salarios = arrayOf("8".toBigDecimal(), "8".toBigDecimal(), "10".toBigDecimal())

    println(salarios.somatoria())
    println(salarios.media())
}