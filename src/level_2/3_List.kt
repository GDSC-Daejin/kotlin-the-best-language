package level_2

fun main() {

    val list = listOf(0, 1, 2, 3)
    val mutableList = mutableListOf<Int>()

    mutableList += 1
    mutableList += 2
    mutableList += 3

    mutableList.forEach {
        println(it)
    }

    val tenList = (1..10).toList()

    tenList.filter {
        // IntA.rem(IntB) is reminder of IntB divided by IntA
        // Check if integer element is even number
        it.rem(2) == 0
    }.forEach {
        println(it) // this prints 2, 4, 6, 8, 10
    }

}