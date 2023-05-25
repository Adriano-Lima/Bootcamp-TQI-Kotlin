package introducao.pratica

fun somar(a:Int, b:Int):Int{
    return a+b
}
fun multiplicar(a:Int, b:Int) = a*b

fun printAll(vararg messages:String){
    for(m in messages) println(m)
}

fun strLength(str: String?): Int {
    return str?.length ?: 0
}

class Contact(val id:Int, var email:String)

class MutableStack<T>(vararg items:T){
    private val elements = items.toMutableList() //equivalente ao ArrayList no Java

    fun push(element: T) = elements.add(element) //mantem ordem de insercao

    fun peek():T = elements.last() //mostra topo da pilha

    fun pop():T = elements.removeLast() //retira topo

    fun isEmpty() = elements.isEmpty()

    fun size():Int = elements.size

    override fun toString(): String {
        return "MultableStack(${elements.joinToString()})"
    }
}

fun main(){
    println("Hello World!")

    println(somar(1,2))
    println(multiplicar(10,5))

    println("Varargs")
    printAll("teste","oi","Ola Mundo")

    println("-- Null Safety --")
    println(strLength(null))
    println(strLength("Teste"))

    println("-- Classes --")
    val contact = Contact(1,"teste@gmail.com")
    println("${contact.id}  ${contact.email}" )
    contact.email = "jane@gmail.com"
    println("${contact.id}  ${contact.email}" )

    println("-- Generics --")
    val stack = MutableStack(1,2,3,4)
    stack.push(5)
    println(stack)
    println("peek(): ${stack.peek()}")
    println(stack)
    println("Retirando os elementos da pilha")
    for(i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}