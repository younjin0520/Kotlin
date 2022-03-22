//중첩 객체를 사용해 Comparator 구현하기
data class Person(val name: String){
    object NameComparator: Comparator<Person>{
        override fun compare(p1:Person, p2:Person):Int=
            p1.name.compareTo(p2.name)
    }
}

fun main(){
    val persons=listOf(Person("Bob"),Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}