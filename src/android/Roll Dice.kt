package android

fun main() {
    val dice = Dice(6)
    println("Dice sides is ${dice.numOfSides}. Your is ${dice.roll()}")

    val dice2 = Dice(200)
    println("Dice sided is ${dice2.numOfSides}. Your is ${dice2.roll()}")
}

class Dice(var numOfSides: Int) {
    fun roll(): Int {
        return (1..numOfSides).random()
    }
}