package moreOnClasses

class Studentt private constructor(){
    var firstname : String? = null
    var lastname : String? = null
    companion object Loader {
        fun loadStudent(jsonText: String) : Studentt {
            val student = Studentt()
            student.firstname = "Firstname"
            student.lastName = "Lastname"
            return student
        }
    }
}

fun main(args: Array<String>){
    val student = Studentt.loadStudent("JSON Text")
}