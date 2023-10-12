//Iterating over a range:

for (i in 1..5) {
    println(i)
}

for (i in 0..10 step 2) {
    println(i)
}

for (i in 5 downTo 1) {
    println(i)
}

val fruits = listOf("apple", "banana", "cherry")

for (fruit in fruits) {
    println(fruit)
}

fruits.forEach { fruit ->
    println(fruit)
}

fruits.map { fruit ->
    println(fruit)
}

fruits.forEach(::println)

val animals = listOf("cat", "dog", "elephant")

animals.withIndex().toList()

for ((index, value) in animals.withIndex()) {
    println("Animal at index $index is $value")
}

animals.forEachIndexed { index, value ->
    println("Animal at index $index is $value")
}