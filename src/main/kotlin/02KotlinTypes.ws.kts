// 4 Kotlin types

//https://kotlinlang.org/docs/numbers.html#floating-point-types

var x: Number = 5

x = 5.5

x = "Test"




//x = null

x

x = 666

x


x = 777

var y: String? = null

//y



/**
 * kotlin.Int -> int
kotlin.Long -> long
kotlin.Float -> float
kotlin.Double -> double
kotlin.Char -> char
kotlin.Short -> short
kotlin.Byte -> byte
kotlin.Boolean -> boolean


When these types are used as nullable types (e.g., Int?), they can't be compiled to Java primitives because primitives can't represent null. In this case, they're represented by their boxed counterparts (Integer, Float, etc.).

When used in generic classes or functions (because of Java's type erasure), they'll also be boxed.

On platforms other than the JVM (like Kotlin/JS or Kotlin/Native), the representation can be different.
 *
 * */


var y1: () -> Unit = {}
y1()


var x2 = null
