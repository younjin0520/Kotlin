fun sendEmailTo(email: String?) { /* 함수 내용 */
}

fun main() {
    val email: String? = "1234@gmail.com"

    if (email != null) sendEmailTo(email)       // if문 사용

    email?.let { email -> sendEmailTo(email) }  // let 함수 사용
    email?.let { sendEmailTo(it) }

}

