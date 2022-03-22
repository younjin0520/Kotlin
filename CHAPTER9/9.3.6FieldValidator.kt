// 사용자의 입력 검증
interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

//String 타입 검증
object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

//Int 타입 검증
object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}
