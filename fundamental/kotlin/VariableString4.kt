package basic.fundamental.kotlin

fun main() {
    val name = "Unico\tde test: \u00A9 \n"
    val statement = "Kot\'lin is \"Awe\\some!\""
    print(name)
    print(statement)
}

/*
1. val name = "Unicode test: \u00A9"
   output: Unicode test : ©

2.  val name = "Unico\tde test: \u00A9 \n"
    val statement = "Kot\'lin is \"Awe\\some!\""
    Unico	de test: ©
    Kot'lin is "Awe\some!"
*/