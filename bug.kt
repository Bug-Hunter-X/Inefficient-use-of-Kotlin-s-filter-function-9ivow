fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)
    //This will print [2, 4], which is correct

    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)
    //This will print [1, 3, 5], which is also correct

    //However, the following will cause a bug 
    val numbers = list.filter { it % 2 == 0 }.plus(list.filter { it % 2 != 0 })
    println(numbers)
    //This will print [2, 4, 1, 3, 5], it's correct, but it's not efficient
    //The list is traversed twice, this can be an issue for larger lists.
}