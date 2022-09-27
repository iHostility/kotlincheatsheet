package su.hostile.kotlincheatsheet

fun main() {
    val x = listOf(1, 2, 3, 4, 5)

    x.forEach { it -> println(it) }
    println(x.map { it -> it * 2 })
    println(x.filter { it -> it %2 == 0 })
    println(x.reduce{ sum, it -> it + sum })

    x.sortedByDescending { it }
    x.any { it > 3 }
    x.all { it > 0 }
    x.sum()

    val numbers = listOf(-2, -1, 1, 2)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    val text = listOf("a", "b", "ccc", "ba", "foo", "bar").groupBy { it.length }
    println(text)
}