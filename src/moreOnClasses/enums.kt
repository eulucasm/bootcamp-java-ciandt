package moreOnClasses

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val r: Int, g: Int, b: Int) {
    RED( 255, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(255, 255, 0)
}

fun drive(direction: Direction){
    when (direction){
        Direction.NORTH -> println("Driving North")
        Direction.SOUTH -> println("Driving South")
        Direction.WEST -> println("Driving West")
        Direction.EAST -> println("Driving East")
    }
}

fun main(args: Array<String>) {
    drive(Direction.NORTH)
    drive(Direction.EAST)

    println(Direction.WEST.ordinal)
}