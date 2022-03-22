fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

