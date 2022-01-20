package classes

class Person(
    var firstName: String,
    var lastName: String = "Marques"
)

fun main (args: Array<String>){
    val person = Person("Lucas")
    val person2 = Person("Lucas", "Maturana")
    println("Person 1 = ${person.firstName} ${person.lastName}")
    println("Person 2 = ${person2.firstName} ${person2.lastName}")
}