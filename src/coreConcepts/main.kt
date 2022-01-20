fun main(args : Array<String>){
    val temperature = 37.5
    val cout : Int = 5
    var name = "Luc"

    name = "fred"

    fun calculateTemperature (celsius : Double) : Double {
        return 9/5 * celsius + 32
    }

    println("temp = ${calculateTemperature(celsius = 20.0)}")
    println("temp = ${calculateTemperature(celsius = 50.0)}")

    val intValue = "32".toInt()
    println("inValue = $intValue")

    val intString = 32.toString()
    println("intString = $intString")

    val fahrenheit = 32
    when (fahrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("getting cold")
        in 31..40 -> println("kid of  cold")
        in 51..60 -> println("getting cold")
        in 61..70 -> println("Just right")
    }

    var nullableName : String? = null
    var length = nullableName?.length ?: -1
    println(length)

    nullableName = "Sam"
    length = nullableName?.length ?: -1
    println(length)
}