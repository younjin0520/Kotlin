fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

// with을 사용해 리팩토링
fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {            // 수신 객체 지정
        for (letter in 'A'..'Z') {
            this.append(letter)             //this를 명시하여 앞에서 지정한 수신 객체(stringBuilder)의 메소드 호출
        }
        append("\nNow I know the alphabet!")//this를 생략하고 메소드 호출
        this.toString()                     //람다에서 값을 반환
    }
}

// 식을 본문으로 하는 함수 활용
fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}