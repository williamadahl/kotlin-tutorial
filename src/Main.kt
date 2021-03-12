/*
* Kotlin supports string templates, so in stead of concatenation "+" we can use "$"
* Here are some top-level function examples
* */

fun sayHello(itemToPrint:String){
    val msg = "Hello " + itemToPrint
    val msgTemplate = "With string template: Hello $itemToPrint"
    println(msg)
    println(msgTemplate)
}
// Here as a single expression function:
fun sayHelloSingleExpression (itemToPrint: String) = println("Hello Kotlin $itemToPrint")

fun twoParams(greetingString:String, greetingTo:String) = println("$greetingString $greetingTo")


fun main() {
    sayHello("Kotlin")
    sayHelloSingleExpression("with single expression")
    twoParams("Hello", "my friend")
}