package basic.fundamental.kotlin

//Versi Asli
/*
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

    /*
        Output : Office is open : false
     */
}
*/

//Versi Pakai Boolean AND
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")
    /*
        Output : Office is open : false
     */
}