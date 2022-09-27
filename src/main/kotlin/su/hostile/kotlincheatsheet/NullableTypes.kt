package su.hostile.kotlincheatsheet

fun main() {
    var a = "Foo"
    println(a.length)

    var b: String? = null
    println("${b?.length}")

    var c = b?.length ?: -1

    b = if ((0..10).random() > 5) "Not today" else null
    var d = b!!.length
}