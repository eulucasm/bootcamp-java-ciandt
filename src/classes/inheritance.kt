package classes

fun main(args: Array<String>) {

    class Grade(var letter: Char, var points: Double, var credits: Double)

    open class Person(var firstName: String, var lastName: String)

    open class Student(firstName: String, lastName: String, var grades: ArrayList<Grade> = ArrayList()) :
        Person(firstName, lastName) {
        open fun recordGrade(grade: Grade) {
            grades.add(grade)
        }
    }

    val john = Person("johnny", "Applessed")
    val jane = Student("Jane", "Applessed")

    println(john.firstName)
    println(jane.firstName)

    val history = Grade('B', points = 9.0, credits = 3.0)
    jane.recordGrade(history)

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName) {
        open var minimumPracticeTime = 2
    }

    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName) {
        override var minimumPracticeTime: Int
            get() = super.minimumPracticeTime * 2
            set(value) {
                super.minimumPracticeTime = value / 2
            }
    }

    fun phonebookName(person: Person): String {
        return "${person.lastName}, ${person.firstName}"
    }

    val person = Person(firstName = "Johnny", lastName = "Appleseed")
    val oboePlayer = OboePlayer("Jane", "Appleseed")

    println(phonebookName(person))
    println(phonebookName(oboePlayer))

    var hallMonitor = Student("Jill", "Bananapeel")
    hallMonitor = oboePlayer

    (oboePlayer as BandMember).minimumPracticeTime = 4

    (hallMonitor as? BandMember)?.let {
        println(
            """this hall monitor is a dand menbe and practices at 
            |least ${hallMonitor.minimumPracticeTime} hours per week""".trimMargin()
        )
    }

    fun afterClassActivity(student: Student): String {
        return "Goes home!"
    }

    fun afterClassActivity(student: BandMember): String {
        return "Goes to practice!"
    }

    println(afterClassActivity(oboePlayer))
    println(afterClassActivity(oboePlayer as Student))

    class StudentAthlete(firstName: String, lastName: String) : Student(firstName, lastName) {
        var failedClasses = ArrayList<Grade>()

        override fun recordGrade(grade: Grade) {
            super.recordGrade(grade)

            if (grade.letter == 'F') {
                failedClasses.add(grade)
            }
        }
        var isEligible : Boolean = true
        get(){
            return failedClasses.size < 3
        }
    }
}