fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(){
    fail("Error occurred")
}

