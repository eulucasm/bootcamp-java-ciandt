import kotlin.random.Random

fun main(args : Array<String>) {
    var counter = 0
    while(counter < 10){
        println("counter é $counter")
        counter +=1
    }

    var count = 0
    var roll = 0
    var random = Random

    do {
        roll  = random.nextInt(6)
        count += 1
        println("After $count roll(s), roll is $roll")
    } while (roll != 0)
    

}