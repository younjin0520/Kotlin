//제네릭 타입으로 타입 캐스팅하기
fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw java.lang.IllegalArgumentException("List is expected") //경고발생
    println(intList.sum())
}

fun main() {
    printSum(listOf("a", "b", "c"))
}

