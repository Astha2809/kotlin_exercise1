//Write a program to find the number of occurrences of the duplicate words in a string and print them.

fun main(args: Array<String>) {
    print("enter string")
    var string1 = readLine()!!
    var words = string1.split(" ").toTypedArray()
    var count=0
    for (i in 0 until words.size) {
         count = 1
        for (j in 1 + 1 until words.size) {
            if (words[i].equals(words[j])) {
                count++
                words[j] = "0"
            }
        }
        if (count > 1 && words[i] != "0") {
            println(words[i] + ":" + count);


        }
    }
}


