/*
/*  자바  */
void postponeComputation(int delay, Runnable computation);

postponeComputation(1000){println(42)}

postponeComputation(1000, object : Runnable{
    override fun run() {
        println(42)
    }
})


//람다가 주변 변수를 포획하는 경우
fun handleComputation(id: String) {
    postponeComputation(1000) {println(id)}
}

*/