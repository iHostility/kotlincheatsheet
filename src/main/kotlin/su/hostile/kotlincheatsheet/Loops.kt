package su.hostile.kotlincheatsheet

fun main() {
    val immutableList = listOf("immutable", "objects", "list")
    var mutableList = mutableListOf("mutable", "objects", "list")

    for (item in immutableList) print("$item ")

    println()

    var index = 0
    while (index < mutableList.size) {
        println("Item at $index -> ${mutableList[index]}")
        index++
    }

    println(3 in 1..5)

    for (i in 1..5) println(i)

    for (i in 1 until 5) println(i)

    for (i in 3 downTo 0) println(i)

    for (i in 0..100 step 25) println(i)
}