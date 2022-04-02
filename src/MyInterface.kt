interface MyInterface {
    val test: Int           //abstract property
    fun foo(): String       //abstract method return string
    fun hello() {            //method with a default implementation
        println("Hello there")
    }
}

class InterfaceSec : MyInterface {

    override val test: Int = 25
    override fun foo() = "Lol"
}

fun main() {
    val obj = InterfaceSec()
    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()
    print("Calling and printing foo(): ")
    println(obj.foo())
}