
fun twoParams(greetingString:String, greetingTo:String) = println("$greetingString $greetingTo")


fun main() {
    val listOfThings = arrayOf("Kotlin", "Java", "Python")
    println("Size ${listOfThings.size}")
    println("First item with indexing: " + listOfThings[0])
    println("First item with get: ${listOfThings.get(0)}")
    for(things in listOfThings){
        println(things)
    }
}