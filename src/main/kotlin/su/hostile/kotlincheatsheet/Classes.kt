package su.hostile.kotlincheatsheet

fun main() {
    val child = Person("Jane", "Dow", 0)
    val parent = Person("John", "Dow", 20, child)

    println(parent.firstName)

    val rectangle = Rectangle(2.0, 3.0)
    val rectangle1 = Rectangle(2.0, 3.0)
    println(rectangle.toString())
    println(rectangle.area())
    println(rectangle.perimeter)
    println(rectangle == rectangle1)
}

class Person(val firstName: String, var lastName: String, var age: Int) {

    var kinders: MutableList<Person> = mutableListOf()

    init {
        println("Hello to new one")
    }

    constructor(firstName: String, lastName: String, age: Int, kinder: Person) :
            this(firstName, lastName, age) {
        kinders.add(kinder)
    }

    constructor() : this("", "", -1)
}

data class Rectangle(var width: Double, var height: Double) {
    val perimeter = (width + height) * 2

    var foo = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Nope")
            else field = value
        }

    fun area() = height * width
}