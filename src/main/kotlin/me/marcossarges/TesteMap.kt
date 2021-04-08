package me.marcossarges

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1239.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("chave: $k ---- $v") }
    println("-------------")


    val map2 = mapOf(
        "Marcos" to 350234.0,
        "Sarges" to 1332
    )
    map2.forEach { (k, v) -> println("chave: $k ---- $v") }
    println("-------------")
}
