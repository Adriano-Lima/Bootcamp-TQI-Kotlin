package orientacao.objeto

//herança simples
open class Cachorro {
    open fun latir() {
        println("au au")
    }
}
class PastorAlemao : Cachorro() {
    override fun latir() {
        println("how how")
    }
}

//Herança Com Construtor Parametrizado
open class Trige(val origem: String) {
    fun sayHello() {
        println("Um tigre da $origem diz: grrhhh!")
    }
}
class TigreSiberiano : Trige("Siberia")

//Herança Passando Argumentos do Construtor para a Superclasse
open class Leao(val nome: String, val origem: String) {
    fun sayHello() {
        println("$nome, o leão da $origem diz: graoh!")
    }
}
class Asiatico(nome: String) : Leao(nome = nome, "India")


//Data Classes
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

//ENUM
enum class State {
    IDLE, RUNNING, FINISHED
}

// Sealed Classes
sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    //herança simples
    val pastor: Cachorro = PastorAlemao()
    val cachorro: Cachorro = Cachorro()
    pastor.latir();
    cachorro.latir()

    //Herança Com Construtor
    val tigre: Trige = TigreSiberiano()
    tigre.sayHello()

    //Herança Passando Argumentos do Construtor para a Superclasse
    val leao: Leao = Asiatico("Rufo")
    leao.sayHello()

    //Data Classes
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

    //ENUM
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    // Sealed Classes
    val cat = Cat("Snowy")
    val human = Human("Adriano", "Developer")
    println(greetMammal(cat))
    println(greetMammal(human))


}

