import java.util.Calendar
import kotlin.math.*

fun main(args: Array<String>) {
    kemboi()
    Myfunction("Kenan",19)
    println( sqrt(49.0))
    siku()
    getDayOfWeek(7)

    println(exp(45.0))
    println(cbrt(27.0))
    println(tan(60.0))
    println(cos(90.0))

}
fun Myfunction(fname:String,Age:Int){

    println("My name is $fname  and i'm $Age years old")

}

fun siku() {
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val outfit = when (dayOfWeek) {
        Calendar.MONDAY -> "Wear a suit and tie."
        Calendar.TUESDAY -> "Wear business casual attire."
        Calendar.WEDNESDAY -> "Wear a button-down shirt and slacks."
        Calendar.THURSDAY -> "Wear jeans and a polo shirt."
        Calendar.FRIDAY -> "Wear casual attire."
        else -> "Relaxing."
    }

    println("Today is ${getDayOfWeek(dayOfWeek)}")
    println(outfit)
}
fun getDayOfWeek(dayOfWeek: Int): String {
    return when (dayOfWeek) {
        Calendar.MONDAY -> "Monday"
        Calendar.TUESDAY -> "Tuesday"
        Calendar.WEDNESDAY -> "Wednesday"
        Calendar.THURSDAY -> "Thursday"
        Calendar.FRIDAY -> "Friday"
        Calendar.SATURDAY -> "Saturday"
        Calendar.SUNDAY -> "Sunday"
        else -> "Unknown day"
    }
}

