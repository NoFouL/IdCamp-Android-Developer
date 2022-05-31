package basic.fundamental.kotlin

//Kotlin mendukung sebuah fitur bernama String Template.
//Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel
//ke dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)
//untuk disisipkan pakai elemen $.

//Tanpa Template
/*fun main() {
    val name = "Kotlin"
    print("My name is " + name)
}
/*
   output : My name is Kotlin
*/*/

//Menyisipkan String
/*fun main() {
    val name = "Kotlin"
    print("My name is $name")
}
/*
   output : My name is Kotlin
*/*/

//Menyisipkan Int
/*
fun main() {
    val name = "Kotlin"
    val old = 3
    print("My name is $name, im $old years old")
}
/*
   output : My name is Kotlin, im 3 years old
*/*/

//Menyisipkan Ekspression
/*
fun main() {
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}
/*
   output : Office is open
*/*/