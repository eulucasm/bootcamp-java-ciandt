package lambdas

fun main(args: Array<String>) {

    fun handleInteger(myInt: Int, operation: (Int) -> Unit) {
        operation(myInt)
    }

    handleInteger(5, { println("My Result is ${it * 10}") })
    handleInteger(5, { _ -> println("My Result is 10") })

    fun printResult(myInt : Int){
        println("My Int is $myInt")
    }
    handleInteger(4, ::printResult)
}