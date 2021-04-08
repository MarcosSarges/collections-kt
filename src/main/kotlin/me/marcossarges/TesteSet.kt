package me.marcossarges

fun main() {
    val marcos = Funcionario("Marcos", 305.0, "CLT")
    val joao = Funcionario("Joao", 303.0, "PJ")
    val sarges = Funcionario("Sarges", 304.0, "CLT")

    val funcionarios1 = setOf(joao, marcos)
    val funcionarios2 = setOf(sarges)

    val result = funcionarios1.union(funcionarios2)

    result.forEach { println(it) }

    println("----------------------")
    val funcionarios3 = setOf(joao, marcos, sarges)
    val result2 = funcionarios3.subtract(funcionarios2)
    result2.forEach { println(it) }

    println("----------------------")
    val funcionarios4 = setOf(joao, marcos, sarges)
    val result3 = funcionarios4.intersect(funcionarios2)
    result3.forEach { println(it) }

}