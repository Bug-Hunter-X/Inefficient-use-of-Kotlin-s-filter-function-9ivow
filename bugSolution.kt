fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    //More efficient solution using a single pass
    val evenAndOddNumbers = list.partition { it % 2 == 0 }
    println(evenAndOddNumbers.first + evenAndOddNumbers.second)
    //This will print [2, 4, 1, 3, 5], and it only traverses the list once.
    
    //For even larger lists, consider using sequence for even better performance 
    val largeList = (1..1000000).toList()
    val evenAndOddNumbersSequence = largeList.asSequence().partition { it % 2 == 0 }
    println(evenAndOddNumbersSequence.first.toList() + evenAndOddNumbersSequence.second.toList())
}