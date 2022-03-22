//나이가 27살 이하인지 판단하는 함수
val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))  //모든 원소가 함수를 만족하는지 판단

    println(people.any(canBeInClub27))

    //count 예제
    println(people.count(canBeInClub27))
    println(people.filter(canBeInClub27).size)
    //조건을 만족시키는 원소 찾기
    println(people.find(canBeInClub27))
}