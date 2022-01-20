package functionsAndNullables

typealias operation = (Int, Int) -> Int
//fun functionName(parameterList): ReturnType {
//    return returnValue
//}

fun main(args: Array<String>){
    fun printMultipleOf(multiplier: Int, addValue: Int){}
    fun printMultipleOf(multiplier: Int, addValue: Int, thirdValue: Int){}
    fun printMultipleOf(multiplier: Int, addValue: Int, thirdValue: Int, forthValue: Int){}

    fun getValue() : Int {
        return 32
    }
    fun getValueString(): String{
        return "Lucas Marques"
    }

    fun add(a : Int, b : Int) : Int {
        return a + b
    }

    var function : (Int, Int) -> Int = ::add
    println(function(4,2))

    fun subtract(a: Int, b : Int) : Int {
        return a - b
    }

    function = ::subtract
    println(function(4,2))

    fun printResult(function: (Int, Int)-> Int, a: Int, b: Int){
    val result = function(a,b)
        println(result)
    }
    printResult(::add, 4, 2)

    fun printResult2(function: operation, a:Int, b:Int){}

    fun noReturn() : Unit{

    }

}