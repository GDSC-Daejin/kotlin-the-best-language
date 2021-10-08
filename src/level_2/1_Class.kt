package level_2

class Person(
    val name : String,
    var age : Int
)

fun main() {

    val person = Person("Harry", 20)

    println(person) // 이건 일반 Class 에 toString() 되었으므로 "person" 의 데이터가 아닌 메모리 주소값을 출력합니다.
    println(person.name)
    println(person.age)

}