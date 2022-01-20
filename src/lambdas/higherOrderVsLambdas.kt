package lambdas

fun main(args: Array<String>) {
    val ints = listOf(2, 3, 20, 50)
    println(ints.filter { it > 10 })

    fun List<Int>.filter(operator: (Int) -> Boolean) {}

    val myStringList = listOf("Sam", "Suzzy", "Jesse", "Ray", "Kevin")
    val updatedList = myStringList.filter { it.length > 3 }.sortedBy{it}
    println(updatedList)

    //view.onClickListener{ println("in Click")} //exemplo ilustrativo

}