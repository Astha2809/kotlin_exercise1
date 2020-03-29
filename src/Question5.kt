import java.util.*

//Find common elements between two arrays.

fun main(args: Array<String>) {
    print("enter length of first array")
    var array1_length: Int = readLine()!!.toInt()
    print("enter elements of first array")
    var array1 = Array<Int>(array1_length) {
        readLine()!!.toInt()
    }
    print("enter length of second array")
    var array2_length = readLine()!!.toInt()
    print("enter elements of second array")
    var array2 = Array<Int>(array2_length) {
        readLine()!!.toInt()
    }

    print("common elements")
    val commonElementsArray = array1.intersect(array2.toList()).toIntArray()
    print(Arrays.toString(commonElementsArray))
}



