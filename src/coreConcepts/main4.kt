fun main(args: Array<String>){

    val yes1: Boolean = true
    val no1: Boolean = false
    val yes2 = true
    val no2 = false
    println("yes1 =  yes2 : ${yes1 == yes2} / no1 = no2 : ${no1==no2}")

    val doesOneEqualTwo = (1==2)
    println("Does 1 equal 2 = ${doesOneEqualTwo}")

    val doesOneNotEqualTwo = (1 != 2)
    println("Does 1 not equal 2 = ${doesOneNotEqualTwo}")

    val longName = "Samantha".length > 5
    println("longename = $longName")

    val and = true && true
    println("and = $and")

    val or = true || true
    println("and = $or")

    val guess = "dog"
    val dogEqualCat = guess == "cat"
    println("dogEqualCat = $dogEqualCat")




}