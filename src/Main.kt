/* Types are non-null by default*/
/* If you want to use null initialized variables use the '?' on type ( nullable) */
var greeting: String? = "hello"
val name: String = "Natalie"

/* Kotlin supports type inferences. Var and Val can therefore be declared as such : */
var mail = "mail@mail"

fun main() {
    println(greeting)
    println(name)

    greeting = null

    println(greeting)
    println(name)

    println(mail)


}