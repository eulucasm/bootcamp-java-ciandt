package propertiesAndMethods

class Course (var className: String){
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