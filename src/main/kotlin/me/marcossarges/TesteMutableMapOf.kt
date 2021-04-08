package me.marcossarges

fun main() {
    val marcos = Funcionario("Marcos", 305.0, "CLT")
    val joao = Funcionario("Joao", 303.0, "PJ")
    val sarges = Funcionario("Sarges", 304.0, "CLT")

    val repo = Repositorio<Funcionario>();
    repo.create(marcos.nome, marcos)
    repo.create(joao.nome, joao)
    repo.create(sarges.nome, sarges)

    println(repo.findById(marcos.nome))

    println("###########")
    repo.findAll().forEach { println(it) }

    println("###########")
    repo.remove(marcos.nome)
    repo.findAll().forEach { println(it) }

}
