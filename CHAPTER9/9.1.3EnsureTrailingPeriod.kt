//CharSequence의 맨 끝에 마침표가 있는지 검사하는 제네릭 함수
fun <T> findDot(seq: T) where T : CharSequence, T : java.lang.Appendable {
    if (!seq.endsWith('.')) {   //CharSequence 인터페이스의 확장 함수 호출
        seq.append('.')              //Appendable 인터페이스의 메소드 호출
    }
}

fun main() {
    val helloWorld = StringBuilder("Hello World")
    findDot(helloWorld)
    println(helloWorld)
}

