package level_2

class Person(
    val name : String,
    var age : Int
)

fun main() {

    val person = Person("Harry", 20)

    println(person) // This shows memory index of "person"
    println(person.name)
    println(person.age)

}