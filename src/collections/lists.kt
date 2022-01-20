package collections

fun main(args: Array<String>){
    val names = listOf("Anna","Brian","Craig","Donna")
    println(names)

    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    println(teamNames)

    teamNames.add("Lucas")
    teamNames.add("Jan")
    println(teamNames)

    println(names[0])

    println(names.indexOf("Brian"))
    teamNames.remove("Craig")
    println(teamNames)

    for(name in teamNames){
        println("Team Member: $name")
    }
}