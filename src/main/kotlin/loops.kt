fun main(args: Array<String>) {
    //THIS IS A FOR LOOP

    for (i in 5..12){
        println("loop : $i")
    }

    val myarr= arrayOf("ab","be","cd","ef","gh",5.6)

    for (n in myarr){
        println(n)
    }
    //THIS IS A WHILE LOOP

    var num =10
    var num1 =0
    var num2 =120

    while (num>=0){
        println("loop : $num")
        num--
    }
    while (num1<=10 ){
        println("loop : $num1")
        num1++
    }
    //DO..WHILE LOOP
    do {
        println("loop : $num2")
        num2++

    }while (num2<=112)



}