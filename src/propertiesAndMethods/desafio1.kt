package propertiesAndMethods

class Course(var className: Map<String, String>){
    lateinit var teacherName: String

    fun setTeacher(teacher: String){
        teacherName = teacher
    }
}

fun main(){
    val course = Course("Math")
    course.setTeacher("Ms Price")

    println(course.teacherName)
}