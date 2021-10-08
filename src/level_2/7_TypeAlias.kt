package level_2

// 타입을 다른 이름으로 치환합니다.
// 하지만 이름만 변경된 것이고, 컴파일 이후에는 본래의 타입으로 컴파일 됩니다.
typealias Name = String
typealias Age = Int

fun main() {

    val name : Name = "Harry"
    val age : Age = 20

    println(name is String) // true
    println(age is Int) // true

}