fun main() {
    //filter 예제
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    //map 예제
    println(list.map{it*it})
}