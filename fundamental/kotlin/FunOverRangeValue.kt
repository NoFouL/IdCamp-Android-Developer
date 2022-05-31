package basic.fundamental.kotlin

fun main() {
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
}

/*
Output :

Max Int: 2147483647
Over range Int: -2147483648
*/