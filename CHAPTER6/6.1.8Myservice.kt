class MyService {
    fun performAction(): String = "test"
}

class MyTest {
    private lateinit var myService: MyService   // 초기화하지 않고 null이 될 수 없는 프로퍼티 선언

    fun setUp() {
        myService = MyService()                 //  프로퍼티 초기화
    }

    fun test() {
        setUp()
        println(myService.performAction())      //  null 검사를 수행하지 않고 프로퍼티 사용
    }
}

fun main() {
    val myTest = MyTest()
    myTest.test()
}

/*class MyService {
    fun performAction(): String = "test"
}

class MyTest {
    private var myService: MyService? = null   // 초기화하지 않고 null이 될 수 없는 프로퍼티 선언

    fun setUp() {
        myService = MyService() //  프로퍼티 초기화
    }

    fun test() {
        setUp()
        println(myService!!.performAction())  //  null 검사를 수행하지 않고 프로퍼티 사용
    }
}
*/
