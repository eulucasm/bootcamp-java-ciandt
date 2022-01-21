package propertiesAndMethods

class Personn(var firstName: String, var lastNAme:String){
    lateinit var fullName : String

    init {
        fullName = "$firstName $lastNAme"
    }
    fun printFullName(){
        if(!this::fullName.isInitialized){
            fullName = "$firstName $lastNAme"
        }
        println(fullName)
    }
}
