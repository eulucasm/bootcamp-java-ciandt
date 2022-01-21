package propertiesAndMethods

import kotlin.properties.Delegates

data class Course (var className:String){
    val courseDescription:String by lazy {
        "Course $className taugth by $teacherName"
    }
    private lateinit var teacherName : String

    var room : String by Delegates.observable("no Room"){
        property, oldValue, newValue ->("New value is $newValue")
    }

    fun setTeacher(teacher : String) {
        teacherName = teacher
    }
}

fun main(args: Array<String>){
    val course = Course("Math")
    course.setTeacher("Ms price")
    course.room = "Library"
}