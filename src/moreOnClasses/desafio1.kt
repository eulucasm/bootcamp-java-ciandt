package moreOnClasses

data class Student(val firstName: String, val lastName: String)

object StudentRegistry{
    val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }
    fun removeStudent(student: Student){
        allStudents.remove(student)
    }
}

fun main(args: Array<String>){

    val lucas = Student("Lucas","Marques")
    val barbara = Student("Barbara","Maturana")

    StudentRegistry.addStudent(lucas)
    StudentRegistry.addStudent(barbara)

    StudentRegistry.allStudents.forEach{
        println("${it.firstName} ${it.lastName}" )
    }

}