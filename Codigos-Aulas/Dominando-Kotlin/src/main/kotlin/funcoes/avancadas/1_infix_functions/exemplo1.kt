/**
 * Infix Functions.
 *
 * @see [Functions](https://play.kotlinlang.org/byExample/01_introduction/02_Functions)
 */

fun main() {

  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2

  val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)

  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  val sophia = Person1("Sophia")
  val claudia = Person1("Claudia")
  sophia likes claudia                                       // 5
}

class Person1(val name: String) {
  val likedPeople = mutableListOf<Person1>()
  infix fun likes(other: Person1) { likedPeople.add(other) }  // 6
}