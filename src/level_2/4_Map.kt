package level_2

fun main() {

    val map = mutableMapOf<String, String>()

    map += "Key" to "Value" // "to" means Pair ("String" to "String" is Pair<String, String>)

    val pairList = listOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
    ) // this is List<Pair<String, Int>

    pairList.toMap() // List<Pair<String, Int> converted to Map<String, Int>

}