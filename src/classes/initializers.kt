package classes

fun main(args: Array<String>) {
    class Person(var firstName:String, var lastName : String) {
        var fullName: String
        init {
            fullName = "$firstName $lastName"
        }
    }

    val person = Person("Lucas","Marques")
    println(person.fullName)
}
