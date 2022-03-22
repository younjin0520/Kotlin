/*//컬렉션의 원소를 다른 컬렉션으로 복사하는 함수
fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}*/

fun <T> copyData(source: MutableList<out T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}