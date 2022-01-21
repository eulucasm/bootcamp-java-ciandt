package propertiesAndMethods

class Person(
    var firstname: String? = null,
    var lastname: String? = null
) {
    val salutation = "Mr"
}

fun main(args: Array<String>) {

    val person = Person("Lucas", "Marques")
    println("Person: ${person.firstname} ${person.lastname}")

}

