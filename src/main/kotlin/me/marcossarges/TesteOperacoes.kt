package me.marcossarges

fun main() {
    val salarios = doubleArrayOf(0.2 + 0.1, 2.0, 2343.0)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------------")
    println("Maior salario ${salarios.maxOrNull()}")
    println("Menor salario ${salarios.minOrNull()}")
    println("Media salario ${salarios.average()}")
    println("----------------------")

    val salariosFiltrados = salarios.filter { it > 2000 }
    for (salario in salariosFiltrados) {
        println(salario)
    }
    println("----------------------")

    println(salarios.count { it in 2000.0..5000.0 })

    println("----------------------")
    println(salarios.filter { it == 2.0 })
    println(salarios.filter { it == 3.0 })

    println("----------------------")
    println(salarios.find { it == 2.0 })
    println(salarios.find { it == 5.0 })

    println("----------------------")
    println(salarios.any { it == 2.0 })
    println(salarios.any { it == 5.0 })
}
