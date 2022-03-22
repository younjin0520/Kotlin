//읽기 함수는 List<Any>에 List<String>을 대입해도 잘 작동한다.
/*fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)    //정수 추가
}

fun main() {
    val strings = mutableListOf("abc", "bac")
    addAnswer(strings)
    println(strings.maxByOrNull { it.length })
}

*/