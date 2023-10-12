// Control flow

val number = 10 - 6

number

val booleanVar = number < 5

if (number >= 5) {
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
    println("Number is less than 5")
} else {
    println("Number is greater than 5")
}

//result1

val result2 = if (booleanVar) "Number is less than 5" else "Number is greater than 5"
//println(result2)



if (number < 5) {
    println("Number is less than 5")
} else if (number == 5) {
    println("Number is 5")
} else {
    println("Number is greater than 5")
}

val value = 3

when (value) {
    1 -> println("Value is 1")
    2 -> println("Value is 2")
    3 -> println("Value is 3")
    4 -> println("Value is 4")
    else -> println("Value is not 1, 2, or 3")
}

val result4 = when (value) {
    1    -> "Value is 1"
    2    -> "Value is 2"
    3    -> "Value is 3"
    4    -> "Value is 4"
    else -> "Value is not 1, 2, or 3" }

println(result4)

//// Ranges
(0..9).toList()
('a'..'z').toList()

(0 until 10).toList()

(0..10 step 2).toList()

(10 downTo 0 step 2).toList()


//// Infix notation
class Example {
    var number = 0

    infix fun add(number: Int): Example {
        this.number += number
        return this
    }
}

val example = Example()
val exResult = example add 5 add 10 add 15

println(exResult.number)
val result8888 = example.add(5).add(10).add(15)
println(result8888.number)

val x = 25

when {
    x in 1..10  -> println("x is in the range from 1 to 10")
    x in 11..20 -> println("x is in the range from 11 to 20")
    x > 20      -> println("x is greater than 20")
    else        -> println("None of the above")
}



val y = 5

val result = when (y) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    else -> "unknown"
}
println("y is $result")