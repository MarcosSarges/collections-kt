package me.marcossarges

data class Funcionario(val nome: String, val salario: Double, val contrato: String) {
    override fun toString(): String = """
        Nome: ${nome}
        Salario: ${salario}
    """.trimIndent()
}