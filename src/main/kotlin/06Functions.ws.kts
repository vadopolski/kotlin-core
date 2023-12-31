fun f0(x: Int, y: Int): Int {
    return x * x + y * y
}

f0(4,4)


fun f1(x: Int, y: Int) = x * x + y * y


f1(4,4)

// Avoid return type
fun add(n: Int, m: Int): Int = n + m

fun sum(vararg ns: Int): Int = ns.fold(0) { acc, i -> add(acc, i) }
sum(33, 42, 99)


// Avoid return type
fun add2(n: Int, m: Int): Int {
    return n + m
}

fun sum2(vararg ns: Int): Int = ns.fold(0) { acc, i -> add2(acc, i) }
sum2(33, 42, 99)


fun summ(vararg ns: Int): Int = ns.fold(0) { n, m -> n + m }
summ(33, 42, 99)

fun summR(vararg ns: Int): Int = ns.fold(0) { n, m -> return n + m }

summR(33, 42, 99)


// How to avoid return type
fun max100Wrong(ns: List<Int>): Int =
    ns.fold(0) { acc, el ->
        val sum = acc + el
        if (sum > 100) return 100
        else sum
    }

// O(n)  >>> O(n - k)

max100Wrong(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))


tailrec fun max100Good(ns: List<Int>, acc: Int): Int =
    if (acc >= 100) 100
    else if (ns.isEmpty()) acc
    else max100Good(ns.drop(1), ns.first() + acc)

// max100Good(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0)
// max100Good(listOf(2, 3, 4, 5, 6, 7, 8, 9, 10), 1)
// max100Good(listOf(3, 4, 5, 6, 7, 8, 9, 10), acc: 3)
// max100Good(listOf(4, 5, 6, 7, 8, 9, 10), acc: 6)
// O(n - k)

max100Good(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0)


// Default parameters
fun decorate(s: String) = "($s)"
decorate("Hello")
fun decorate2(s: String) = "(" + s + ")"
decorate2("Hello")

fun decorate(s: String, left: String = "{", right: String = "}") = "$left$s$right"
decorate("Hello", "[", "]")
decorate("Hello")

