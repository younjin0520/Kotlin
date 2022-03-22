fun <T : Number> oneHalf(value: T): Double {   //Number를 타입 파라미터 상한으로 지정
    return value.toDouble() / 2.0              //Number 클래스에 정의된 메소드 호출
}

fun main() {
    println(oneHalf(3))
}

