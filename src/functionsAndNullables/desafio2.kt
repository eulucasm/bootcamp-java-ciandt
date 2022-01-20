package functionsAndNullables

fun main(args : Array<String>){
    var myFavoriteSong: String? = "the Final Countdown"

    fun printFavoriteSong(song:String?){
        println(song)
    }

    printFavoriteSong(myFavoriteSong)
    myFavoriteSong = null
    printFavoriteSong(myFavoriteSong)
}