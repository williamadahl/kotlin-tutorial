/* Kotlin variables are non-null by default
*  If we want nullable variables add '?' after type
*  Kotlin supports type inference on variables and properties!
* */

var email = "mail@mail"
var name: String? = "Natalie"

fun main() {

    email = "@gmail.com"
    name = null
    println(name)
    println(email)


}