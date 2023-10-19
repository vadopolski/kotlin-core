// Simple while loop:
var count = 5
while (count > 0) {
    println(count)
    count--
}


// while loop with a condition:
var value = 1
while (value < 32) {
    println(value)
    value *= 2
}

//Simple do-while loop:
var number = 10
do {
    println("Current number: $number")
    number -= 3
} while (number > 0)




// Simple while loop with accomulating value:
var sum = 0
var current = 1
while (current <= 10) {
    sum += current
    current++
}
sum
current



(1..10).sum()

(1..10).reduce { acc, el -> acc + el }
//                1, 2 -> 3
//                3, 3 -> 6
//                6, 4 -> 10


(1..10).fold(100) { acc, el -> acc + el }
//                        100, 1 -> 101
//                        101, 2 -> 103
//                        103, 3 -> 106


(1..10).fold(0, Int::plus)





