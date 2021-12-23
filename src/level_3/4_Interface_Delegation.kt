package level_3

data class User(
    val name : String,
    val age : Int
)

interface UserRepository {
    fun getUser() : User?
    fun clearUser()
    fun setUser(user : User)
}

class UserRepositoryImp : UserRepository {

    private var cachedUser : User? = null

    override fun getUser() = cachedUser

    override fun clearUser() {
        cachedUser = null
    }

    override fun setUser(user: User) {
        cachedUser = user
    }
}

// 생성자로 주입받은 userRepository 에 delegate 하면서 UserViewModel 은 주입받은 객체를 덮어쓰게 됩니다.
// 그래서 UserRepository 를 상속 받았지만, 주입받은 UserRepository 의 구현을 전부 위임받아 UserRepository 내부의 구현을 처리할 필요가 없습니다.
// 즉 그 해당 객체의 구현을 위임하기 때문에 동일한 구현을 다른 클래스 내에 여러번 하지 않아도 되는 이점을 가지고 있습니다.
class UserViewModel(userRepository: UserRepository) : UserRepository by userRepository

fun main() {

    val repository : UserRepository = UserRepositoryImp()
    val viewModel = UserViewModel(repository)

    if (viewModel.getUser() == null) {
        viewModel.setUser(User("Harry", 20))
    }

    println(viewModel.getUser())
}