package basic.fundamental.kotlin

/*
fun main() {
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go
}
*/

fun main() {
    val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())
    /*
     output: 26
     Dengan fungsi konversi di atas, nilai 23 yang semula bertipe String di
     konversi ke tipe Int yang kemudian dimasukan ke dalam operasi matematika.
     */
}

/*
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
 */