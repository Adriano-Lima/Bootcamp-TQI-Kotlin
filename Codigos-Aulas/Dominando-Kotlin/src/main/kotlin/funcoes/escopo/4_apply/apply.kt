/**
 * Funções de Escopo: [apply].
 *
 * @see [apply](https://play.kotlinlang.org/byExample/06_scope_functions/04_apply)
 */

data class Pessoa(var nome: String, var idade: Int, var sobre: String) {
    constructor() : this("", 0, "")
}

fun main() {

    val jake = Pessoa()                                     // 1
    val stringDescription = jake.apply {                    // 2
        nome = "Jake"                                       // 3
        idade = 30
        sobre = "Android developer"
    }.toString()                                            // 4

    println(stringDescription)
}