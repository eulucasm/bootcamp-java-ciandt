package collections

fun main(args: Array<String>){
    var lucas = mutableMapOf(
        "name" to "Lucas",
        "profession" to "developer",
        "country" to "Brazil",
        "state" to "São Paulo",
        "city" to "Monte Mor"
    )
    println(lucas)

    lucas["city"] = "Campinas"
    lucas["state"] = "SP"
    println(lucas)

    fun printLocation(person: Map<String,String>){
        val state = if (person.containsKey("state")) person["state"] else ""
        val city = if (person.containsKey("city")) person["city"] else ""
        println("Person lives in $city, $state")
    }
    printLocation(lucas)

}