package classes
data class Student(
    val firstName : String,
    val lastName : String,
    val grade : Char
)
data class Student2(
    val firstName : String,
    val lastName : String,
    val grade : Char = 'A'
)

fun main(args: Array<String>){
    var sam = Student("Sam", "Gamgee",'A')
    println(sam)

    sam = sam.copy(grade = 'B')
    println(sam)

    val fred = Student2("Fred","Smith")
    println(fred)
}