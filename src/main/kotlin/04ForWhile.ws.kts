//Iterating over a range:

for (i in 1..5) {
    println(i)
}
// This will print numbers from 1 to 5.


// Iterating over a range with a step:

for (i in 0..10 step 2) {
    println(i)
}
// This will print even numbers from 0 to 10: 0, 2, 4, 6, 8, 10.


// Iterating backwards:

for (i in 5 downTo 1) {
    println(i)
}
// This will print numbers from 5 down to 1.


// Iterating over a collection:

val fruits = listOf("apple", "banana", "cherry")

for (fruit in fruits) {
    println(fruit)
}
// This will print each fruit in the list.

val animals = listOf("cat", "dog", "elephant")

// Iterating with an index:

for ((index, value) in animals.withIndex()) {
    println("Animal at index $index is $value")
}
// This will print the index along with the animal.

// Simple while loop:

var count = 5
while (count > 0) {
    println(count)
    count--
}
// This will print numbers from 5 down to 1.


// while loop with a condition:

var value = 1
while (value < 32) {
    println(value)
    value *= 2
}
// This will print powers of 2 less than 32: 1, 2, 4, 8, 16.

//Simple do-while loop:
var number = 10
do {
    println("Current number: $number")
    number -= 3
} while (number > 0)
// This will print: 10, 7, 4, 1.
