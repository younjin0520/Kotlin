/*interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int { //T를 in 위치에 사용
    }
}

fun main(){
    val anyComparator = Comparator<Any> {
        e1, e2 -> e1.hashCode() - e2.hashCode()
    }
    val strings: List<String> =
        strings.sortedWith(anyComparator)
}*/