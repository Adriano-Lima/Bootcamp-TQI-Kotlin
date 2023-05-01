enum class Status {
    REP, REC, APR
}

fun verificarStatus(media: Double): Status = when {
    media < 5 -> Status.REP
    (media >= 5 && media < 7) -> Status.REC
    else -> Status.APR
}

fun main() {
    val media = readLine()!!.toDouble();
    println(verificarStatus(media))
}