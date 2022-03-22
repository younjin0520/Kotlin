interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {                    // Unit을 반환하지만 타입을 지정할 필요 없음
        // 처리 코드                             // return을 명시할 필요 없음
    }
}