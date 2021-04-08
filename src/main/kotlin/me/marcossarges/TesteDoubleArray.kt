package me.marcossarges

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 0.2 + 0.1
    salarios[1] = 231.0
    salarios[2] = 234.4

    salarios.forEach { println(it) }


    println("-----------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 2
    }

    salarios.forEach { println(it) }

    println("-----------------------")
    val salarios2 = doubleArrayOf(0.2 + 0.1,2.0,23.0)
    salarios2.sort()
    salarios2.forEach { println(it) }


}
