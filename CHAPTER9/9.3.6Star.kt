fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printFirst(listOf("A", "B"))
}