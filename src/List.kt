data class Alien(var name: String, var position: Int)

fun main() {

    val values = listOf<Int>(4, 5, 6, 7, 9)

    val evens = values.filter { it % 2 == 0 }
    val doubleValues = evens.map { it * 2 }

    evens.forEach { println(it) }
    doubleValues.forEach { println(it) }
}