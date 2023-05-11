class sturborn{
    // datamember
    private var nambari=3
// member function
    fun calulate():Int{

        return nambari *nambari

    }
}

fun main(args: Array<String>) {
    //this is an objt
    val myobjct=sturborn()
    println(myobjct.calulate())
}