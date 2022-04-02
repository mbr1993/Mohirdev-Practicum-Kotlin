package student

fun main() {
    while (true) {
        print("1.Add    2.List    3.Quit: ")
        val input = readLine()?.toIntOrNull()
        if (input == null) {
            println("Invalid input")
            continue
        }
        when (input) {
            1 -> addStudent()
            2 -> showList()
            3 -> break
            else -> println("Invalid input")
        }
    }
}

fun showList() {
    println("ID\t\tNAME\t\tCOURSES")
    Repository.getStudent().forEach {
        println(String.format("%d \t\t%s \t\t%s", it.id, it.name, it.courses.joinToString()))
    }
}

tailrec fun addStudent() {
    print("ID: ")
    val id = readLine()?.toIntOrNull()
    if (id == null) {
        println("Invalid input")
        return addStudent()
    }
    print("Name: ")
    val name = readLine() ?: ""

    print("Courses: ")
    val courses = readLine() ?: ""

    val student = Student(id, name, courses.split(","))
    Repository.addStudent(student)
}
