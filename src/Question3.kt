//Write a program to find the number of occurrences of a character in a string without using loop.


fun main(args: Array<String>) {
    var s1 = "Hello all"
    var ch = 'a'
    val count = s1.count { it == ch }
    println("$ch occurs $count ")
}