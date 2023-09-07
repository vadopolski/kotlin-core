// 4 Kotlin types

//https://kotlinlang.org/docs/numbers.html#floating-point-types

var x = 5

x


x = 666

x


// x = "test"

var y = "null"

y



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


var y: () -> Unit = { println("Lambda called!") }
y()

