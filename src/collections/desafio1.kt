package collections

fun main(args: Array<String>){

    var players = arrayOf("Alice","Lucas","Marcos","Ana","Betoven")

    println("index Of Marcos = ${players.indexOf("Marcos")}")

    players = arrayOf("Anna","Brian","Craig","Dan","Donna","Eli","Franklin")
    val scores = arrayOf(2,2,8,6,1,2,1)

    var index = 0
    for (player in players){
        println("${index + 1}. $player - ${scores[index]}")
        index++
    }

    players.forEachIndexed{index, player ->
        println("${index + 1}. $player - ${scores[index]}")

    }
}