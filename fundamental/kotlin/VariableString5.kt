package basic.fundamental.kotlin

fun main() {
    val line1 = """
        Line 1
        Line 2
        Line 3
        Line 4 
    """.trimIndent()

    val line2 = """
    Mencetak nya berjarak sesuai margin
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimMargin()

    val line3 = """
        baris awal di garis tepi kiri
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimStart()

    val line4 = """
    ada baris baru sebelum outputnya
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimEnd()

    println(line1)
    println(line2)
    println(line3)
    println(line4)
}

/*
    output:
        Line 1
        Line 2
        Line 3
        Line 4
 */