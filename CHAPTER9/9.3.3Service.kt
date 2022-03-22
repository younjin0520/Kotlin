import java.util.ServiceLoader
/*
//loadService 함수의 정의
inline fun <reified T> loadService(){       //타입 파라미터를 reified로 표시
    return ServiceLoader.load(T::class.java)
}

fun main() {
    val serviceImpl = loadService<Service>()
}
*/