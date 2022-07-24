fun main() {
    val letter = readln()
    for (i in 'a'..'z') {
        if (i.toString() == letter) break
        print(i)
    }
}