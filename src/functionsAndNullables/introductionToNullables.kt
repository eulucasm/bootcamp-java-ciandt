package functionsAndNullables

fun main(args : Array<String>){
    var nickname : String? = null

    fun printNickName(nickname:String?){
        println("My nickname is $nickname")
    }
    printNickName(nickname)

    nickname = "Lucão"
    printNickName(nickname)

}