package basic.function.kotlin

fun main() {
    val user = setUser("Naufal", 20)
    println(user)

    Greet("Naufal")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun Greet(name: String) {
    println("Welcome Back $name !")
}

/*
output :

Your name is Naufal, and you 20 years old
Your name is Naufal
*/