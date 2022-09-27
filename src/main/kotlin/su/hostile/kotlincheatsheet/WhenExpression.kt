package su.hostile.kotlincheatsheet

fun main() {
    one(1)
    one("Foo")
    one(true)
    one(listOf("1", "2", 3))
}

fun one(input: Any) {
    when (input) {
        1 -> println("It's a number")
        in 0..5 -> println("not working if already picked")
        is String -> println("$input Bar")
        is Boolean -> println("Bruh")
        else -> println("Nope")
    }
}