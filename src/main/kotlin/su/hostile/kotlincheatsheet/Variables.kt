package su.hostile.kotlincheatsheet

fun main() {
    val immutable: String = "Immutable variable"

    var mutable: String = "Mutable variable"
    mutable = "Mutated value"

    val int = 1
    var double = 1.0

    println("$immutable $mutable ${int + double}")
}