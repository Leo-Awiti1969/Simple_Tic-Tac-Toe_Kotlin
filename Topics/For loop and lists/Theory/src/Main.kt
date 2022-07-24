// You can experiment here, it won’t be checked

fun main() {
    startApp()
}

fun startApp() {
    val inputString = readln()
    printBoard(inputString)
}

fun printBoard(inputString: String) {
    val mutList2D = mutableListOf(
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0)
    )
    for (i in 0..8) {
        when (i) {
            in 0..2 -> inputString[i].code.also { mutList2D[0][i] = it }
            in 3..5 -> inputString[i].code.also { mutList2D[1][i] = it }
            in 6..8 -> inputString[i].code.also { mutList2D[2][i] = it }
            else -> println("Invalid input")
        }
    }
    println("---------\n$mutList2D\n---------")
}
