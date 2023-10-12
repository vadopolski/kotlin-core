object Recursion {

    tailrec fun sum(n: Int): Int = if (n == 1) 1 else n + sum(n - 1)

    tailrec fun sumTailRec(n: Int, accumulator: Int): Int {
        return if (n == 1) accumulator
        else sumTailRec(n - 1, accumulator + n)
    }


    @JvmStatic
    fun main(args: Array<String>) {

        sum(55000000)

        val message = sumTailRec(55000000, 0)
        println("The Result is: $message")

    }
}