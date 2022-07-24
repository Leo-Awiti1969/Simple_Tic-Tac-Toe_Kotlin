const val ONE_HALF = 1.5
const val HALF = 0.5
const val TWO = 2
fun main() {
    val testText = readln()
    if (testText.length % 2 != 0) {
        val textFirst = testText.substring(0, (testText.length / TWO + HALF).toInt())
        val textLast = testText.substring((testText.length / TWO + ONE_HALF).toInt())
        println(textFirst + textLast)
    } else {
        val textFirst = testText.substring(0, testText.length / TWO - 1)
        val textLast = testText.substring(testText.length / TWO + 1)
        println(textFirst + textLast)
    }
}