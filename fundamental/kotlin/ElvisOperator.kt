package basic.fundamental.kotlin

//fun main(){
    //(-)val text: String? = null
    //val textLength = text?.length ?: 7

    //sama

    //val textLength = if (text != null) text.length else 7
//}
//Elvis akan mengembalikan nilai text.length jika text tidak bernilai null.
//Sebaliknya, jika text bernilai null maka default value yang akan dikembalikan.


//Perhatikan penggunaan operator non-null assertion (!!), misalnya seperti berikut:
//fun main(){
    //val text: String? = null
    //val textLength = text!!.length // ready to go ???
//}

//Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable.
//Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null.
//Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.