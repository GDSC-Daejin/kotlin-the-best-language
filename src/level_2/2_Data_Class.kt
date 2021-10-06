package level_2

data class PersonData(
    val name : String,
    var age : Int
)

fun main() {

    val harry = PersonData("Harry", 20)

    val readablePersonString = harry.toString()

    println(readablePersonString) // This shows actual class values. Person(name = "Harry", age = 20)
    println(harry.name)
    println(harry.age)

    // You can copy data class and modifying
    val clonedHarry = harry.copy(age = 19)
    println(clonedHarry.name)
    println(clonedHarry.age)

    // You don't need to implement "hashCode()" and "equals()" in data class, It is optional
    if (clonedHarry == harry) {
        println("Never! Cloned Harry is Not a Harry.")
    }

    val jason = PersonData(age = 21, name = "Jason")

    // All members of data class is implemented as "componentN()" Functions
    println(jason.component1()) // this is "name"
    println(jason.component2()) // this is "age"

    // You can destructuring declarations of data class
    val (nameOfJason, ageOfJason) = jason
    println(nameOfJason)
    println(ageOfJason)

    
}