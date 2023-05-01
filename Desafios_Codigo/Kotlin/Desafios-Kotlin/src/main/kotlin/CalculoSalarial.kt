fun calcularImposto(salario: Double): Double {
    val aliquota = when (salario) {
        in 0.0..1100.0 -> 0.05
        in 1100.01..2500.00 -> 0.10
        else -> 0.15
    }
    return aliquota * salario
}

fun main() {
    val valorSalario:Double = readLine()?.toDouble() ?: 0.0
    val valorBeneficios:Double = readLine()?.toDouble() ?: 0.0

    val valorImposto = calcularImposto(valorSalario)
    val saida = valorSalario - valorImposto + valorBeneficios
    println(String.format("%.2f", saida))
}