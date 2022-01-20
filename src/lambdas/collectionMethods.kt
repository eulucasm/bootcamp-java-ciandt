package lambdas

fun main(args: Array<String>) {
    val values = listOf(24, 5, 10, 4)
    println(values.filter { it > 5 })

    val names = listOf("Sam", "Fred", "Samuel", "Alice")
    println(names.first { it.length > 5 })

    println(names.any {it == "Alice"})
    println(names.all {it.length > 2})
}