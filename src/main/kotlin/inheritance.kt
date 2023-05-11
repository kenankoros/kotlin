open class mzazi{

    val mama = "she likes traveling"
    val baba = "he likes keeping cattle"

}

class boy:mzazi(){
    fun mvulana(){
     println(baba)
 }

}

class girl:mzazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val mvobj=boy()
    mvobj.mvulana()
    val msiobj=girl()
    msiobj.msichana()
}