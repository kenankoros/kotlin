
//pareent class
class  Shapes{
    open fun draw(){
        println("rawind shape function")
    }

}
//child class
class circle:Shapes{
    override fun draw(){
        println("Drawing a circle")
    }

}
class triangle:Shapes{
    override fun draw(){
        println("draw a triangle")
    }

}
class square:Shapes{
    override fun draw(){
        println("drawing a square")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shapes> = arrayOf(circle(),square(),triangle())
    for (shape in shapes )
        shape.draw()

}