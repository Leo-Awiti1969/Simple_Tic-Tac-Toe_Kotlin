fun main() {
    val theWord = readln()
    for (i in 'a'..'z') {
        if (i in theWord) continue
        print(i)
    }
}