package basic.fundamental.kotlin

fun main() {
    val openHours = 7
    val now = 2
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    print(office)
}