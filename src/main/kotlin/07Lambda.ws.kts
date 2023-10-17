
val f: (String) -> Unit = { s -> println(s) }


val function: (Int) -> Int = { x -> x + 1 }

listOf(1,2,4).map(function)


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


