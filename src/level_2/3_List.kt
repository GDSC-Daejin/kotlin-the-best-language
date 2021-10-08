package level_2

fun main() {

    val list = listOf(0, 1, 2, 3)
    val mutableList = mutableListOf<Int>()

    mutableList += 1
    mutableList += 2
    mutableList += 3

    mutableList.forEach {
        println(it) // 1, 2, 3
    }

    val tenList = (1..10).toList()

    tenList.filter { // 특정한 조건에 의해 리스트에 있는 내용을 필터링할 수 있습니다.
        // IntA.rem(IntB) 은 IntA 를 IntB 로 나눴을때의 나머지입니다.
        // 즉 이 코드는 리스트에 있는 숫자가 짝수인지 아닌지 구별합니다.
        it.rem(2) == 0
    }.map { // map 은 리스트에 있는 항목을 다른 타입이나 값으로 변형을 할 수 있습니다.
        // 여기서는 제곱을 한 뒤 Double 로 치환했습니다.
        (it * it).toDouble()
    }.forEach {
        println(it) // 4.0, 16.0, 36.0, 64.0, 100.0 가 출력됩니다.
    }

}