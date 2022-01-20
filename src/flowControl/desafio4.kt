import kotlin.math.sqrt

fun main(args: Array<String>){

    val range = 1..10
    for( i in range){
        val square = i * i
        println("$square")
    }

    for ( i in range){
        val squareRoot = sqrt(i.toDouble())
        println("$squareRoot")
    }

    var sum = 0
    for(row in 0..8){
        if ( row % 2 == 1){
            for (column in 0..8){
                sum += row * column
            }
        }
    }
    println("$sum")
}