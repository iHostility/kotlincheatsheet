package su.hostile.kotlincheatsheet

fun main() {
    println("One: ${one()}")
    println("Two: ${two(1, 2)}")
    println("Two named arguments: ${two(y = 5, x = -5)}")
    println("Default values: ${three()}")
    four("LoL", "kequE", "ChEBureQUeq")
    four(*arrayOf("lorem", "ipsum", "dolor"))
}

fun one(): Int = 5 + 5

fun two(x: Int, y: Int): Int {
    return x + y
}

fun three(x: Int = 1, y: Int = 2): Int = y - x

fun four(vararg strings:String) {
    strings.forEach { println(it.uppercase()) }
}