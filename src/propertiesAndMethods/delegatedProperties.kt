package propertiesAndMethods

data class Course1(val map: Map<String, Any?>){
    val room : String by map
    val teacher : String by map
}

fun main(args: Array<String>){
    val course = Course(mapOf("room" to "room 1", "Teacher" to "Ms Price"))
    println(course)
}