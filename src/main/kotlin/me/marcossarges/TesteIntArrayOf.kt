package me.marcossarges

fun main() {
    val values = intArrayOf(1,3,4,5,6,7,1213,23)

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