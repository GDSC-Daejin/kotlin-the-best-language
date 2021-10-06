package level_2

fun main() {

    val list = listOf(0, 1, 2, 3)
    val mutableList = mutableListOf<Int>()

    mutableList += 1
    mutableList += 2
    mutableList += 3

    mutableList.forEach {
        println(it) // this prints 1, 2, 3
    }

    val tenList = (1..10).toList()

    tenList.filter { // Filter each value with specific boolean condition
        // IntA.rem(IntB) is reminder of IntB divided by IntA
        // Check if integer element is even number
        it.rem(2) == 0
    }.map { // map value to other types or something
        (it * it).toDouble()
    }.forEach {
        println(it) // this prints 4.0, 16.0, 36.0, 64.0, 100.0
    }

}