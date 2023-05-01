fun converteMesPorExtenso(mes: Int): String = when (mes) {
    1 -> "Janeiro"
    2 -> "Fevereiro"
    3 -> "Marco"
    4 -> "Abril"
    5 -> "Maio"
    6 -> "Junho"
    7 -> "Julho"
    8 -> "Agosto"
    9 -> "Setembro"
    10 -> "Outubro"
    11 -> "Novembro"
    12 -> "Dezembro"
    else -> "Mes Invalido!"
}

fun validarData(dia: Int, mes: Int): Boolean {
    val validarDia = when {
        dia in 1..31 -> true
        else -> false
    }
    val validarMes = when {
        mes in 1..12 -> true
        else -> false
    }
    return (validarDia && validarMes)
}

fun main() {
    val entrada: String? = readLine()
    entrada?.let { // se a antrada nao for nula
        if (entrada.count { it == '/' } == 2) { //verificando se foi passado duas barras
            val (dia, mes, ano) = entrada.split("/") //separando cada elemento da data
            if (validarData(dia.toInt(), mes.toInt())) {
                val mesPorExtenso = converteMesPorExtenso(mes.toInt())
                println("$dia de $mesPorExtenso de $ano")
            }
        }
    }
}