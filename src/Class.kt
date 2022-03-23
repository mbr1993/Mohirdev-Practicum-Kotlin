fun main() {
    val myCar = Car("Nexia", "Chevrolet", 2015)

    println("I have a ${myCar.brand} ${myCar.model} from ${myCar.year}")
}

class Car {
    val brand: String
    val model: String
    val year: Int

    constructor(brand: String, model: String, year: Int) {
        this.brand = brand
        this.model = model
        this.year = year
    }
}
