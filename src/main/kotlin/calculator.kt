fun main(args: Array<String>) {
    println("Welcome to the simple calculator |<KENAN>| !!!!!!")
    print("enter the first number : ")
    val num= readln()?.toDouble()?:0.0

    print("enter second number : ")
    val num1= readln()?.toDouble()?:0.0

    print("enter operation (+,-,*,/):" )
    val op= readln()


         when(op){
        "+"-> println("$num+$num1=${num+num1}")
        "-"-> println("$num-$num1=${num-num1}")
       "*"-> println("$num*$num1=${num*num1}")
        "/"-> println("$num/$num1=${num/num1}")
        else -> println("invalid")



    }


}
