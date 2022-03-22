data class Person(val name:String, val age:Int)
val people = listOf(Person("Alice",29),Person("Bob",31))

fun main(){
    //map으로 사람의 리스트를 이름의 리스트로 변환
    println(people.map{it.name})
    println(people.map(Person::name))   //멤버참조이용
    println(people.filter{it.age>30}.map(Person::name))

    //가장 나이 많은 사람의 이름 찾기
    people.filter{it.age==people.maxByOrNull(Person::age)!!.age }
    val maxAge=people.maxByOrNull(Person::age)!!.age
    people.filter{it.age==maxAge}
}