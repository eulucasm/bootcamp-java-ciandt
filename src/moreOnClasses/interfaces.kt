package moreOnClasses

interface Animal{
    fun eat()
    val numLegs : Int
}

class Dog : Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Dog eating Loudly")
    }
}

class Cat : Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Cat eating Loudly")
    }
    fun meow(){
        println("meow meow")
    }
}

fun main(args: Array<String>){
    val dog = Dog()
    val cat = Cat()

    dog.eat()
    cat.eat()
    cat.meow()
}