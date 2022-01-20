fun main(args: Array<String>){

    val myAge = 40
    when (myAge){
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        in 61..110 -> println("Elderly")
        else -> println("Invalid age")
    }

    val pair = Pair("kevin",40 )
    when (pair.second){
        in 0..2 -> println("${pair.first} is a Infant")
        in 3..12 -> println("${pair.first} is a Child")
        in 13..19 -> println("${pair.first} is a Teenager")
        in 20..39 -> println("${pair.first} is a Adult")
        in 40..60 -> println("${pair.first} is a Middle aged")
        in 61..110 -> println("${pair.first} is a Elderly")
        else -> println("Invalid age")
    }

    val personsAge = when(myAge){
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..39 -> "Adult"
        in 40..60 -> "Middle aged"
        in 61..110 -> "Elderly"
        else -> "Invalid age"
    }
    println(personsAge)

}