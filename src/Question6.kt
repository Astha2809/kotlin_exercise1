//Check letter in string which do not have pair
fun main(args: Array<String>) {
    println("enter string")
    var user_string = readLine()!!.toString()
    val charArray = user_string.toCharArray()

    for (i in 0 until user_string.length) {
        for (j in i + 1 until user_string.length) {
            if (charArray[i] == charArray[j]) {
                charArray[i] = '#'
                charArray[j] = '#'
            }
        }
    }
    for (i in 0 until charArray.size) {
        if (charArray[i] != '#') {
            println(charArray[i])
        }
    }
}