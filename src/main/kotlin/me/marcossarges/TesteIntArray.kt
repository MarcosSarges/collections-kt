package me.marcossarges

fun main() {

    val values = IntArray(5)

    values[0] = 1 * 5
    values[1] = 2 * 4
    values[2] = 3 * 3
    values[3] = 4 * 2
    values[4] = 5 * 1

    println(values)
    for (valor in values) {
        println(valor)
    }
    println("///////")
    values.forEach { v ->
        println(v)
    }

    println("///////")
    for (i in values.indices) {
        print(i)
        print("--")
        print(values[i])
        println("")
    }

    println("///////")
    values.sort()
    for (value in values) {
        println(value)
    }
}

