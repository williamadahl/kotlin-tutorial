
var greeting: String? = null

fun main() {

    /* standard if / else */
    if(greeting != null){
        println(greeting)
    }else{
        println("hi")
    }
    println("--------------")

    /* when statement is much like switch statement */
    when(greeting){
        null -> println("hi")
        else -> println(greeting)
    }
    println("--------------")
    /* If greeting has some value, the val vil be set to greeting.*/
    val greetingToPrint = if(greeting != null) greeting else "I am greetingToPrint, hi"
    println(greetingToPrint)
    println("--------------")

    greeting = "Hello"

    val secondGreeting = when(greeting){
        null -> "hi"
        else -> greeting
    }
    println(secondGreeting)
}