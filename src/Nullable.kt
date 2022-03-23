lateinit var name: String        //later initialize
var age: Int? = null             //nullable or null safety. (not in java)
var car: String = readLine()!!   //not null


fun main() {
    name = "John"
    println(name.uppercase())
    println(age ?: 18)           //elvis
    println(car)
}


