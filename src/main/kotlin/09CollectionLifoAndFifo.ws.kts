import java.util.*
import kotlin.collections.ArrayDeque

// Stack - LIFO
val stackArray = ArrayDeque<Int>()

stackArray.addFirst(10)
stackArray.addFirst(20)
stackArray.addFirst(30)

stackArray.first()

stackArray.removeFirst()

stackArray.isEmpty()

stackArray


// Stack - LIFO
val stackList = LinkedList<Int>()

stackList.push(10)
stackList.push(20)
stackList.push(30)

stackList.peek()

stackList.pop()

stackList.isEmpty()

stackList



// Queue - FIFO
val queue = ArrayDeque<Int>()

queue.addLast(10)
queue.addLast(20)
queue.addLast(30)

queue.first()
queue.removeFirst()
queue.isEmpty()

queue

