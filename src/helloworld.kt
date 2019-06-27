import java.util.*
import java.util.spi.CalendarDataProvider

fun main() {
    println("soo, ")
    print("hello\n")

    var x = 10

    var name1 = "aheli" //OR
    var name2:String = "aheli" //redundant
    var name = readLine() //read user input int the form of string
    //var age:Int = readLine()!!.toInt() //****

    var dep:String?  // ? means NULL value. you may define it later on(null or proper val).
    //here writing string is imp cuz otherwise computer won't know which type is dep
    dep = "yay"
    //print(dep)
    print(dep!!) //means that dep MUST have some non-null value

    //var is read and write both.
    //val is read only
    val pi:Double = 3.14

    var age:Int?
    var age1:String = "15"

    age = age1.toInt()   //toFloat, from double to toInt, toString etc etc

    //operator precedence
    //()
    // ++ -- (before  var)
    //^
    // * /
    // + -
    // =
    // ++ -- (after the variable)

    var year = Calendar.getInstance().get(Calendar.YEAR)
    println(year)

    //switch case
    when(x) {
        1-> print("one")
        2, 3 -> print("two or three")
        in 4..10 -> print("4 to 10")

        !in 20..30 -> print("not betw 20 and 30")

        else -> {
            print("greater than 10, less than 20")
        }
    }

    var g  = 1
    var n = 2
    var max = if(n > g) n else g

    var e:Boolean?
    for (i in 18..58) {
        e = true;
    }
}