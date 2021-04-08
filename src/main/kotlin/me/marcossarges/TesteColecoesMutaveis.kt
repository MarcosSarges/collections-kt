package me.marcossarges

fun main() {
    val marcos = Funcionario("Marcos", 305.0, "CLT")
    val joao = Funcionario("Joao", 303.0, "PJ")
    val sarges = Funcionario("Sarges", 304.0, "CLT")

    val funcionarios = mutableListOf(marcos, joao, sarges)
    funcionarios.forEach { println(it) }

    println("##############")
    val pedro = Funcionario("Pedro", 304.0, "CLT")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("##############")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("##############")
    val funcionarioSet = mutableSetOf(marcos, joao, sarges)
    funcionarioSet.forEach { println(it) }

}