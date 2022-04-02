package student

import com.google.gson.Gson
import java.io.File

object Repository {
    private val studentsFile = File("studentsFile.json")
    private val gson = Gson()

    init {
        if (studentsFile.canRead().not()) {
            studentsFile.createNewFile()
        }
    }

    private val students =
        gson.fromJson(studentsFile.readText(), Array<Student>::class.java)?.toMutableList() ?: mutableListOf()

    fun addStudent(student: Student) {
        students.add(student)
        studentsFile.writeText(gson.toJson(students))
    }

    fun getStudent(): List<Student> {
        return students
    }
}