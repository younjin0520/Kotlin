val people2=listOf(Person("Alice",31),Person("Adam",31),Person("Jason",23),
Person("Park",35),Person("Bob",35))

fun main(){
    println(people.groupBy{it.age})
}