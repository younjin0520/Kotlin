import kotlin.reflect.KClass

object Validators {
    //이전과 같은 map을 사용하지만 외부에서 접근 불가
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    //어떤 클래스와 검증기의 타입(T)이 맞는 경우에만 map에 넣음
    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    //캐스팅이 안전하지 않다는 경고 무시
    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T> ?: throw java.lang.IllegalArgumentException("No validator")
}

fun main() {
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    println(Validators[String::class].validate("Kotlin"))
    println(Validators[Int::class].validate(42))
}

