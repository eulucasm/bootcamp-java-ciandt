package propertiesAndMethods
class Person3 {
    var firstName  =""
    var child = Child()

    fun setFirst(firstName : String){
        this.firstName = firstName
    }

    inner class Child{
        var firstName = ""

        fun printParentege(){
            println("Child ${this@Child.firstName} whith parent ${this@Person3.firstName}")
        }
    }
}

fun main(){
    val person = Person3()
    person.firstName = "Sam"
    person.child.firstName = "Susy"
    person.child.printParentege()
}
