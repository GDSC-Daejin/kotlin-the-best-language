package level_3

private sealed class StateClass<D> {
    class Loading<D> : StateClass<D>()
    data class Failed<D>(val throwable: Throwable) : StateClass<D>()
    data class Success<D>(val data: D) : StateClass<D>()
}

private sealed interface StateInterface<D> {
    class Loading<D> : StateInterface<D>
    data class Failed<D>(val throwable: Throwable) : StateInterface<D>
    data class Success<D>(val data: D) : StateInterface<D>
}

private fun randomGenerateState(): StateClass<String> {
    return when ((0..2).random()) {
        0 -> StateClass.Loading()
        1 -> StateClass.Success("Meow")
        2 -> StateClass.Failed(Throwable("Oops!"))
        else -> throw IllegalStateException("Can't be else")
    }
}

fun main() {
    when (val state: StateClass<String> = randomGenerateState()) {
        is StateClass.Failed -> {
            print("Failed : ${state.throwable.message}")
        }
        is StateClass.Loading -> {
            print("Loading...")
        }
        is StateClass.Success -> {
            print("Success : ${state.data}")
        }
    }
}