package level_2

data class PersonData(
    val name : String,
    var age : Int
)

fun main() {

    val harry = PersonData("Harry", 20)

    val readablePersonString = harry.toString()

    println(readablePersonString) // Person(name = "Harry", age = 20)
    println(harry.name)
    println(harry.age)

    // Data Class 는 객체를 복사할 수 있습니다.
    val clonedHarry = harry.copy(age = 19)
    println(clonedHarry.name)
    println(clonedHarry.age)

    // "hashCode()" 와 "equals()" 를 구현할 필요가 없습니다.
    if (clonedHarry == harry) {
        println("Never! Cloned Harry is Not a Harry.")
    }

    val jason = PersonData(age = 21, name = "Jason")

    // Data Class 의 모든 멤버들은 "componentN()" 함수로 갖고올 수 있습니다.
    println(jason.component1()) // 이건 사실 1번째 값인 "name" 입니다.
    println(jason.component2()) // 이것도 2번째 값인 "age" 입니다.

    // Data Class 에 변수를 지정하지 않고 바로 멤버들을 변수로 째놓을 수 있습니다.
    val (nameOfJason, ageOfJason) = jason
    println(nameOfJason)
    println(ageOfJason)

    
}