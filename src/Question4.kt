//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.

fun main(args: Array<String>) {
    var upperCase=0;
    var lowerCase=0;
    var digits=0;
    var others=0;
    print("enter string")
    var user_string= readLine()!!
    var length=user_string.length
    for(i in 0 until length){
        if(user_string[i].isUpperCase()){
            upperCase++
        }
        else if(user_string[i].isLowerCase()){
            lowerCase++
        }
        else if(user_string[i].isDigit()){
            digits++
        }

    }
    var new_length=length.toFloat()
    var uppercase_percent=(upperCase*100)/new_length
    var lowercase_percent=(lowerCase*100)/new_length
    var digits_percent=(digits*100)/new_length
    var other_percent=(others*100)/new_length
    print("uppercase_percent" +uppercase_percent)
    print("lowercase_percent" +lowercase_percent)
    print("digits_Percent" +digits_percent)
    print("other_Percent" +other_percent)
}

