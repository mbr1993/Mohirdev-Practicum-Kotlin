abstract class Person(name: String) {
    init {
        println("My name is $name")
    }


    fun displayJob(job: String) {
        println("My job is $job")
    }

    abstract fun displayAge(age: Int = 23)
}

class Teacher(name: String) : Person(name) {
    override fun displayAge(age: Int) {
        println("My age is $age")
    }
}

fun main() {
    val teacher: Person = Teacher("John")
    teacher.displayAge(30)
    teacher.displayJob("Android developer")
}