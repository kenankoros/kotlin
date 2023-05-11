private class mimi(val jina:String="koros",val shule:String="Paul",val mwaka:Int=1978){

}

fun main(args: Array<String>) {
    val obj=mimi("Kenan","Kamagut High school",2022)
    val myobjct=mimi()
    println("My name is ${myobjct.jina} I went to ${obj.shule} and finished my form four in the year ${obj.mwaka} ")

    val objt = Student ("Ajeet", 30)

}

class Student{
    constructor(name: String, age: Int){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}