package moreOnClasses

interface Shape {
    var width : Int
    var height : Int
    fun draw()
}

class Circle(override var width: Int, override var height: Int): Shape{
    override fun draw() {
        println("Drawing a Circle")
    }
}
class Line(override var width: Int, override var height: Int): Shape{
    override fun draw() {
        println("Drawing a Line")
    }
}
fun printShape(shape: Shape){
    shape.draw()
}

fun main(args: Array<String>){

    val circle = Circle(10,10)
    val line = Line(10,10)

    printShape(circle)
    printShape(line)
}