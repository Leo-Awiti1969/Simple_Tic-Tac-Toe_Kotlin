fun main() {
    val text = readln()
    var testText = ""
    for (i in text.indices) {
        testText = "${text[i]}$testText"
    }
    println(if (text == testText) "yes" else "no")
}