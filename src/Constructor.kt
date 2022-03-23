open class Parent {
    constructor(name: String, id: Int) {
        println("this executes first:")
        println("Name = $name, Id = $id")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes third:")
        println("Name = $name, Id = $id, Password = $pass")
    }
}

class Child : Parent {
    constructor(name: String, id: Int) : super(name, id) {
        println("this executes second:")
        println("Name = $name, Id = $id")
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
        println("this executes forth:")
        println("Name = $name, Id = $id, Password = $pass")
    }
}

fun main() {
    Child("Ashe", 101)
    Child("John", 105, "password")
}  