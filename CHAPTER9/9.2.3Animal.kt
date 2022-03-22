open class Animal {
    fun feed() {
    }
}
/*
class Herd<T : Animal> {    //파라미터를 무공변성으로 지정
    val size: Int
        get() =
            operator

    fun get(i: Int): T {
        ...
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
        //feedAll(cats)
    }
}

class Herd<T : Animal>(var leadAnimal: T, vararg animals: T)*/