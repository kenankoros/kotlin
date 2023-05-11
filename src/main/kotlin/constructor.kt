class  students(val name:String,val gener:String,val age:Int){

}

fun main(args: Array<String>) {
    //this is an obejct

    val myobjct=students("Kenan","Male",19)

    println("Student Name is ${myobjct.name} and he is ${myobjct.gener} of ${myobjct.age} years ")

}