// You can experiment here, it won’t be checked

startApp()


}

fun startApp() {
    val inputString = readln()
    printBoard(inputString)
}

fun printBoard(inputString: String) {
    print("---------\n| ${inputString[0]} ${inputString[1]} ${inputString[2]} |\n" +
            "| ${inputString[3]} ${inputString[4]} ${inputString[5]} |\n" +
            "| ${inputString[6]} ${inputString[7]} ${inputString[8]} |\n---------")
    val mutList2D = mutableListOf(
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0)
    )
    for (i in 0..8) {
        when (i) {
            in 0..2 -> inputString[i].code.also { mutList2D[0][i] = it }
        } in (0..2)) {

        } else if (i in 3..5) {
            inputString[i].code.also { mutList2D[1][i] = it }
        } else {
            inputString[i].code.also { mutList2D[2][i] = it }
        }
    }
}
