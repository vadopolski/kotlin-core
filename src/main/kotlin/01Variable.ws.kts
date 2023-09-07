
// 1 var: Mutable variable.
var x = 5

x

x = 10

x

// 2 val: Immutable (read-only) variable.
val y: String = "Hello, Kotlin"

//y = "Change me"


// 4
fun greet() = "Hello"

println(greet())  // Prints "Hello, Alice"




// 3 lazy val
val test: Int by lazy { 9 }

test


