// Control flow

val number = 10


val result1 = if (number < 5) {
    println("Number is less than 5")
} else {
    println("Number is greater than 5")
}

result1

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
    else -> println("Value is not 1, 2, or 3")
}

val x = 25

when {
    x in 1..10 -> println("x is in the range from 1 to 10")
    x in 11..20 -> println("x is in the range from 11 to 20")
    x > 20 -> println("x is greater than 20")
    else -> println("None of the above")
}

val y = 5
val result = when (y) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    else -> "unknown"
}
println("y is $result")
