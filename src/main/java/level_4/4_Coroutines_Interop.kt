package level_4

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

data class User(val name : String)

class UserTask {

    private var callback : (User) -> Unit = {}

    private val thread = Thread {
        Thread.sleep(1000)
        callback(User(listOf("Harry", "Jason", "Want").random()))
    }

    fun setEventListener(callback : (User) -> Unit) {
        this.callback = callback
        thread.start()
    }

}

// 새로운 확장함수를 만들어 suspend 키워드를 붙여 코루틴에서 사용할 수 있도록 블로킹함수를 구성하고,
// 이벤트 리스너에서 값을 받을때 Continuation<T (여기선 User)> 에 값을 넘겨준다.
suspend fun UserTask.await() = suspendCoroutine<User> { continuation ->
    setEventListener {
        continuation.resume(it)
    }
}


fun main() {

    val userTask = UserTask()

    // 일반적인 사용
    userTask.setEventListener {
        println(it)
    }

    // 콜백 함수의 코루틴화
    runBlocking {
        launch {
            // 동기처리 방식처럼 사용할 수 있다.
            val user = userTask.await()
            println(user)
        }
    }

}
