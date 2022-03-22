fun <T> printHashCode1(t: T) {
    println(t?.hashCode())
}

fun <T : Any> printHashCode(t: T) {
    println(t.hashCode())
}

fun main() {
    printHashCode1(null)
}