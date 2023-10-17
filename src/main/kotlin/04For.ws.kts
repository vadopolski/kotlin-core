//Iterating over a range:

for (i in 1..5) {
    println(i)
}

for (i in 0..10 step 2) {
    println(i)
}


var sumEl = 0
for (i in 5 downTo 1) {
    sumEl = sumEl + i
    println(i)
}

sumEl

val fruits = listOf("apple", "banana", "cherry")

for (fruit in fruits) {
    println(fruit)
}


//fun highOrser(f: Int -> Int, n: Int): Int = f(n)

fun highOrder(f: (Int) -> Int, n: Int): Int = f(n)
val product: (Int) -> Int = { x -> x * x }
highOrder(product, 3)
highOrder({ x -> x + x }, 3)


fruits.forEach { fruit ->
    println(fruit)
}

fruits
    .map { fruit ->
    println(fruit)
    fruit.uppercase() }
    .filter { fruit ->
        fruit.startsWith("A") }
    .forEach { fruit ->
        println(fruit) }


fruits.forEach(::println)




val animals = listOf("cat", "dog", "elephant")


for ((index, value) in animals.withIndex()) {
    if (index == 0) {
        println("The first animal is $value")
    }
    println("Animal at index $index is $value")
}

//animals(0)

animals[2]

animals.forEachIndexed { index, value ->
    println("Animal at index $index is $value")

}