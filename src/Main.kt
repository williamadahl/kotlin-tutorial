/* Unit = absence of any type
*  Can be used for functions that does not return anything but calls other functions
*  Can also omit the "Unit" type value
*  Can also use the nullable return type with "?"
* */

fun sayHello(): String{
    return "Hello from function"
}

fun sayHelloSimple () = "Hello from simple function"

fun callSayHello() {
    println("From caller function: " + sayHello())
}

fun main() {
    println(sayHello())
    println(sayHelloSimple())
    callSayHello()

}