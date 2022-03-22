fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {     //  안전한 호출을 사용하지 않아도 됨
        println("Please fill in the fields")
    }
}

fun String?.isNullOrBlank(): Boolean =
    this == null || this.isBlank()

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)      //  null을 수신 객체로 전달해도 예외가 발생하지 않음
}

