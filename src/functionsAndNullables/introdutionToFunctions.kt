package functionsAndNullables

fun main(args: Array<String>){
    fun printMyName(){
        println("My name is Lucas Marques")
    }
    printMyName()

    fun printMultipleOfFive(value: Int){
        println("${value} * 5 = ${value * 5}")
    }
    printMultipleOfFive(value = 10)

    fun printMultipleOf(multiplier : Int, addValue : Int){
        println("$multiplier * $addValue = ${multiplier * addValue}")
    }
    printMultipleOf(multiplier = 4, addValue = 2)

    fun printMultipleOf2(multiplier : Int, Value : Int = 1){
        println("$multiplier * $Value = ${multiplier * Value}")
    }
    printMultipleOf2(multiplier = 4)

    fun multiply(number : Int, multiplier : Int) : Int {
        return number * multiplier
    }
    println(multiply(4,2))

    fun multiplyAndDivide (number : Int, factor: Int): Pair<Int, Int>{
        return Pair(number*factor, number/factor)
    }
    println("Multiple & Divide ${multiplyAndDivide(4,2)}")
}