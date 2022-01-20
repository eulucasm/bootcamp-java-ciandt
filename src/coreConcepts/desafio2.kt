fun main(args: Array<String>) {
    val myAge = 30
    val isTeenager = myAge >= 13 && myAge <= 19
    println("isTeenager = $isTeenager")

    val theirAge = 30
    val bothTeenagers = theirAge >=13 && theirAge <= 19 && isTeenager
    println("bothTeenagers = $bothTeenagers")

    val student = "Joe Bloggs"
    val author = "kevin Moore"
    val authorIsStudent = student == author
    println("authorIsStudent $authorIsStudent")

    val studentBeforeAuthor = student < author
    println("studentBeforeAuthor = $studentBeforeAuthor")

    if (myAge >= 13 && myAge <= 19){
        println("Teenager")
    }else{
        println("Not a tennager")
    }

    val answer = if (myAge >= 13 && myAge <= 19) "Teenager" else "Not a teenager"
    println(answer)

}