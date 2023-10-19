
val f: (String) -> Unit = { s -> println(s) }
val f2 = { s: Int -> println(s) }


// Higher order functions
fun lineHighOrderFunction(k: Int, f: (Int) -> Int): (Int) -> Int = { x -> k * f(x) }

val lambda: (Int) -> Int = { x -> x }
val line2x: (Int) -> Int  = lineHighOrderFunction(2, lambda)
line2x(3)

val line3x = lineHighOrderFunction(3, { x -> x })
line3x(3)

val parabola = lineHighOrderFunction(2, { x -> x * x + x + 1 })
parabola(3)

// Higher order + collections
fun funPLusOne(x : Int) { x + 1 }
val lambdaPLusOne: (Int) -> Int = { x -> x + 1 }

listOf(1,2,4).map(lambdaPLusOne)
listOf(1,2,4).map{funPLusOne(it)}


fun printSmth(s: String) = println(s)


fun <T> p(s: T) {
    println(s)
}


p(654)  // The compiler infers the type as Int
p(true) // The compiler infers the type as Boolean



// CQS - Command Query Separation

var j = 0

// Whats wrong with this function?
fun increaseAndModifyState() {
    j += 100
    // inserting, update, delete in DB
}

// If method modifies state, it should not return anything or make effect
// If method returns something, it should not modify state or make effect


