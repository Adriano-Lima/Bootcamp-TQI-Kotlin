class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
        habitantes += (habitantes * taxaCrescimento)
    }
}

fun main() {
    val habitantesPaisA = readLine()?.toDouble() ?: 0.0;
    val habitantesPaisB = readLine()?.toDouble() ?: 0.0;

    val paisA = Pais(habitantesPaisA,0.03)
    val paisB = Pais(habitantesPaisB,0.015)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) { //equanto a populacao de A for menor que a de B
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
        quantidadeAnos++
    }
    println("$quantidadeAnos anos")
}