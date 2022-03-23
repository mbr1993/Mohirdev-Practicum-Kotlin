fun main() {
    val myCar = Car(brand = "Ford", model = "Mustang", year = 1969)
    val myCar2 = Car("Nexia", "Chevrolet", 2015)

    println("I have a ${myCar.brand} ${myCar.model} from ${myCar.year}")
    println("${myCar2.model}  ${myCar2.brand}  ${myCar2.year}")

    myCar.drive()
    myCar.stop()
}

class Car(val brand: String, val model: String, val year: Int) {

    fun drive() = println("Driving")
    fun stop() = println("Stopping")
}
