open class animal(colour:String,age:Int){
    init {
        println("color is $colour")
        println("the age is $age years")
    }
}
class dog(colour: String,age: Int):animal(colour,age){

    fun woof(){
        println("dogs makes sound of woof")
    }

}
class cat(colour: String,age: Int):animal(colour,age){
    fun meow(){
        println("cats makes sound of meow")
    }
}
class lion(colour: String,age: Int):animal(colour,age){
    fun roar(){
        println("lions makes a sound of roaring")
    }
}

fun main(args: Array<String>) {
    val obdog=dog("white",3)
    obdog.woof()
    val obcat=cat("grey",3)
    obcat.meow()
    val obli=lion("brown",7)
    obli.roar()
}