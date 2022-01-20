fun main(args : Array<String>){
//    while ( /* condição */){
//        //loop code
//    }
    var i = 1
    while (i < 10) {
        print(i)
        i+=1
    }
    println("_____")

//    do {
//        //loop code
//    } while (/** condition */)
    i = 1
    do {
        print(i)
        i+=1
    } while (i<10)
    println("_____")

    i = 1
    do {
        print(i)
        if(i ==5){
            break
        }
        i+=1
    } while (i <10)
    println(" After do ")
}

