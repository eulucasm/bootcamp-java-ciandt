package functionsAndNullables

fun main(args: Array<String>){
    fun printFullName( firstName: String, lastName: String){
        println(firstName + " " + lastName)
    }
    printFullName(firstName = "Lucas", lastName = "Marques")
    printFullName("Lucas", "Marques")

    //_______________________________________________________________________________

    fun calculateFullName(firstName : String, lastName : String) : String {
        return firstName + " " + lastName
    }
    println(calculateFullName("Lucas", "Marques"))
    //_______________________________________________________________________________

    fun calculateFullNameWithLength(firstName: String, lastName: String) : Pair <String, Int>{
        val fullName = firstName + " " + lastName
        return Pair(fullName, fullName.length)
    }
    println(calculateFullNameWithLength("Lucas","MArques"))

}