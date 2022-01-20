package functionsAndNullables

fun main(args : Array<String>){

    val myFavoriteSong : String? = null // "The Final Contdown"

    myFavoriteSong?.let {println(myFavoriteSong)} ?: println("I don't have a favorite song")

    fun printNickname(nickname: String?){
        println("Your nickname is: ")
        nickname?.let { println(nickname) } ?: println("no nickname")
    }
    printNickname("Lucão")
}