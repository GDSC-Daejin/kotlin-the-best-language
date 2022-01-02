package level_1

fun thisIsFunction() : String {
    return "Hello"
}

fun thisIsAlsoFunction() = "Hello No bracket"

fun thisIsParameterFunction(name : String) = "Hello $name"

fun thisIsOptionalParameterFunction(name : String = "Harry", age : Int) : String {
    return "Hello $name, I'm $age years old."
}

fun main() {

    println(thisIsFunction())
    println(thisIsAlsoFunction())
    println(thisIsParameterFunction("Harry"))
    println(thisIsParameterFunction(name = "Harry"))
    println(thisIsOptionalParameterFunction(age = 20))

}