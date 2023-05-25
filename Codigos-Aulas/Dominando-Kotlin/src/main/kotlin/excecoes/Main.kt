package excecoes

class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("$name nao pode votar")
    }
    println("Voto realizado com sucesso")
}

fun main() {
    var quantVotos = 0;
    quantVotos += try {vote("A", 30);1;} catch (e: IllegalVoterException) {0;}
    quantVotos += try { vote("B",15);1;}catch(e:IllegalVoterException){0;}
    println (quantVotos);
}