
/*
* Vararg means variable amount of arguments, this way we don't have to send anything into the function.
* Kotlin treats the greetingTo as an array, so with empty, we get an empty array.
* */
fun sayHello(greetingString: String, vararg greetingTo:String) = run {
    greetingTo.forEach{ personToGreet ->
        println("$greetingString, $personToGreet")
    }
}

fun greetPerson(greeting: String, person: String) = println("$greeting, $person")

fun main() {

    val listOfThings = arrayOf("Kotlin", "Java", "Python")
    sayHello("hello", "Kotlin", "Programming", "Toilet")
    /* In kotlin we use the '*' as a spread operand */
    sayHello("hello", *listOfThings)

    /*
    * Named arguments, this way we don't mess up the order of arguments etc
    * now it does not matter which order they are passed in
    * */
    greetPerson(greeting="Hello", person = "Natalie")
}