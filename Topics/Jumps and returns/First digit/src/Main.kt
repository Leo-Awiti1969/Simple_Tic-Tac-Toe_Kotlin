fun main() {
    val alphaNumeric = readln()
    for (i in alphaNumeric.indices) {
        if (alphaNumeric[i].isLetter()) {
            continue
        } else {
            print(alphaNumeric[i])
            break
        }
    }
}