package collections

fun main(args: Array<String>){
    var name = ArrayList<String>()
    name.add("Lucas")
    name.add("João")

    fun printNames(names : ArrayList<String>){
        println(names)
        names.removeAt(0)
    }
    printNames(name)
    println(name)
}
