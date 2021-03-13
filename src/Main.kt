
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

/*
* Example with default values in a function:
* With this tool, we don't have to have constructors, getters, setters.
* */
fun greetWithDefault(greeting: String = "Good morning", person: String = "Slave") = println("$greeting, $person")

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

    /* Called function with default parameters some times :
    *  Note, if you use named parameter for one of the parameter, you have to do it for the others
    * */
    greetWithDefault()
    greetWithDefault(greeting = "Obey")
    greetWithDefault(person = "Natalie")
    greetWithDefault(person = "Natalie", greeting = "Bow down")
    sayHello(greetingString = "Sit back down", greetingTo = *listOfThings)
}