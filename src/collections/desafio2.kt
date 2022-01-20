package collections

fun main(args: Array<String>){

    var states = mutableListOf<String>("SP","RJ","RN","BA")
    states.add("MA")
    println(states)

    fun printStates(states: List<String>){
        for (i in 0..states.size - 1){
            if(i != 3){
                println("$i ${states[i]}")
            }
        }
    }
    printStates(states)
}