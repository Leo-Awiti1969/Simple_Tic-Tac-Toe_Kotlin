fun main() {
    val digits = readln()
    var sum1 = 0
    var sum2 = 0
    for (i in digits.indices) {
        if (i in 0..2) {
            sum1 += digits[i].digitToInt()
        } else {
            sum2 += digits[i].digitToInt()
        }
    }
    println(if (sum1 == sum2) "Lucky" else "Regular")
}