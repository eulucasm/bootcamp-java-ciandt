package lambdas

fun main(args: Array<String>) {

    val values = listOf(24, 5, 10, 4)
    println(values.filter { it > 5 }.sum())


    data class Person(val name: String, val age: Int)

    val sam = Person("Sam", 30)

    val (name, age) = sam
    println("$name is $age years old")

    val names = mapOf<String, Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)
    for ((name, age) in names) {
        println("$name is $age years old")
    }
}