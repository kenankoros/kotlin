fun kenan(){
    println("This is a customised user defined function")
}
fun kemboi(){
    val num=3
    val num1=8
    println("The sum of : $num + $num1 = ${num +num1}")
}

fun main(args: Array<String>) {
    kenan()
    kemboi()

    //creat objct
    val obj=emobilis()
    println(obj.hesabu())

}

class emobilis{
    //data
    var num2:Int=6
    //member function
    fun hesabu():Int{
        return num2*num2

    }
}