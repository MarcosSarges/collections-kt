package me.marcossarges

fun main() {
    val marcos = Funcionario("Marcos", 305.0, "CLT")
    val joao = Funcionario("Joao", 303.0, "PJ")
    val sarges = Funcionario("Sarges", 304.0, "CLT")

    val funcionarios = listOf(marcos, joao, sarges)

    funcionarios.forEach { println(it) }


    println("-------------------")
    println(funcionarios.find { it.nome == "Marcos" })
    println("-------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------------")
    funcionarios
        .groupBy { it.contrato }
        .forEach {
            println(it)
            it.value.forEach { el -> println(el) }
        }

}


