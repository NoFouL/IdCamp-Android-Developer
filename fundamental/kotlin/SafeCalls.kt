package basic.fundamental.kotlin

fun main (){
    val text: String? = null
    text?.length
}

//safe call akan menjamin kode yang kita tulis aman dari NullPointerException. Dalam menggunakan safe call,
// kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable.

//Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.