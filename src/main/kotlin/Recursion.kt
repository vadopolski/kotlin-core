object Recursion {


    tailrec fun sum(n: Int): Int = if (n == 1) 1 else n + sum(n - 1)
//    sun(5) = 5 + sum(4)
//    sum(4) = 4 + sum(3)
//    sum(3) = 3 + sum(2)
//    sum(2) = 2 + sum(1)
//    sum(1) = 1
//    sum(5) = 5 + 4 + 3 + 2 + 1



    tailrec fun sumTailRec(n: Int, accumulator: Int): Int {
        return if (n == 1) accumulator
        else sumTailRec(n - 1, accumulator + n)
    }

//    sumTailRec(5, 0)
//    sumTailRec(4, 5)
//    sumTailRec(3, 9)
//    sumTailRec(2, 12)
//    sumTailRec(1, 14)
//    res = 15


    @JvmStatic
    fun main(args: Array<String>) {

//        println(sum(550000))

        val message = sumTailRec(55000000, 0)
        println("The Result is: $message")

    }
}