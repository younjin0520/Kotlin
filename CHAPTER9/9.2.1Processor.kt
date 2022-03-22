class Processor<T : Any> {  //T타입은 null이 될 수 없음
    fun process(value: T) {
        value.hashCode()
    }
}

fun main() {
    val nullableStringProcessor = Processor<String>()
}

