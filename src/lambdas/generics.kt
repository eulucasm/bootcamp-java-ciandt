package lambdas

//fun main(args: Array<String>) {
//
//    val names = ArrayList<String>()
//    val myNumbers = ArrayList<Number>()
//    myNumbers.add(1)
//    myNumbers.add(2.5)
//    println(myNumbers)
//}

interface Repository<T>{
    fun addItem(item:T)
    fun deleteItem(item:T)
}
class Person(val name: String){}

class PersonRepository : Repository<Person>{
    override fun addItem(item: Person) {
        TODO("Not yet implemented")
    }

    override fun deleteItem(item: Person) {
        TODO("Not yet implemented")
    }

}

fun <T> printItem(item : T){
    println(item)
}
fun <QualquerCoisa> printItem2(item : QualquerCoisa){
    println(item)
}

fun main(args: Array<String>) {
    printItem("teste de generics")
}
