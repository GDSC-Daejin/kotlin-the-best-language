package level_2

// You can alias type to another name.
// But it does not change types after compile.
typealias Name = String
typealias Age = Int

fun main() {

    val name : Name = "Harry"
    val age : Age = 20

    println(name is String) // true
    println(age is Int) // true

}