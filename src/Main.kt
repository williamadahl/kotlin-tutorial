
fun sayHello(greetingString: String, greetingTo:List<String>) = run {
    greetingTo.forEach{ personToGreet ->
        println("$greetingString, $personToGreet")
    }
}


fun main() {
    val listOfThings = listOf("Kotlin", "Java", "Python")
    listOfThings.forEach { thing ->
        println(thing)
    }
    /* Map takes in pairs
    *  By default a collection type in kotlin is immutable
    * */
    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python")
    map.forEach{ (key, value) -> println("$key -> $value")}

    /*
    * Here is an mutable example
    * */

    val mutableMap = mutableMapOf(1 to "Nina", 2 to "Natalie", 3 to "Lexi")
    mutableMap.put(4, "Nadia")
    mutableMap.forEach{ (key, value) -> println("$key -> $value")}

    /* Passing a collection type as a parameter */
    sayHello("hello", listOfThings)
}