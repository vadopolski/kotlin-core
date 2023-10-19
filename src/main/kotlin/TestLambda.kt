import kotlin.jvm.functions.Function2

class TestLambda {

    fun sumFun(a: Int, b: Int) = a + b

    val sumLambda = { a: Int, b: Int -> a + b }

}