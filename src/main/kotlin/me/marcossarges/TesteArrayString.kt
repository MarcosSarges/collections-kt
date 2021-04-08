package me.marcossarges;

fun main() {
    val nomes = Array(10) { "" }

    nomes[0] = "Marcos"
    nomes[1] = "Sarges"
    nomes[3] = "José"
    nomes[9] = "José"

    for (nome in nomes) {
        print(nome.isEmpty())
        print("---")
        print(nome.isBlank())
        print(" ")
        println(nome)
    }

    println("---------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }
    println("---------------------------------")
    val nomes2 = arrayOf("Maria","Zara","Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}