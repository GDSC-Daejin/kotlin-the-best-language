package level_2

fun main() {

    val map = mutableMapOf<String, String>()

    map += "Key" to "Value" // "to" 는 Pair 라는 자료형을 만들어줍니다. ("String" to "String" 은 Pair<String, String>)

    val pairList = listOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
    ) // 이건 List<Pair<String, Int>

    pairList.toMap() // List<Pair<String, Int> 가 Map<String, Int> 로 변환될 수 있습니다.

}