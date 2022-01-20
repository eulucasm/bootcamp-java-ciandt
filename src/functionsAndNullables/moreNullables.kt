package functionsAndNullables

fun main (args: Array<String>){
    var result : Int? = 30
    println(result)
    //maneira errada = println(result + 1)

    val newResult = result?.plus(5)

    var x : Int? = null
    if(x != null) {
        x += 1
    }
    println(result !! + 1)

    var authorName : String? = "Lucas Marques"
    var authorAge : Int? = 30

    var unwrapperdAuthorName = authorName!!
    println("Author Is ${authorName!!}")

    //authorName = null
    if(authorName != null){
        println("Author is ${authorName!!}")
    }else {
        println("No Author")
    }

    authorName?.let { name ->
        println("author is $name")
    }
    authorName?.let {
        println("author is $it")
    }

    var nullableInt : Int? = 10
    var mustHaveResult = nullableInt ?: 0

}