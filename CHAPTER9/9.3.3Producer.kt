interface Producer<out T> { //클래스가 T에 대해 공변적이다.
    fun produce(): T
}