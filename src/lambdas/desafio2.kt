package lambdas

fun main(args: Array<String>){

    fun <T> printItem(item:T){
        println("My Item is $item")
    }
    printItem(1)
    printItem("Hello")

    fun <T> printList(list : List<T>){
        for( item in list){
            println("list item : $item")
        }
    }
    printList((listOf("Lucas", "maria", "joao")))

}