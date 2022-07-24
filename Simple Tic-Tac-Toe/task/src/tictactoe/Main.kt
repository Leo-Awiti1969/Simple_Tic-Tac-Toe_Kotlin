package tictactoe

import kotlin.system.exitProcess

fun main() {
    val listString = mutableListOf("_", "_", "_", "_", "_", "_", "_", "_", "_")
    val emptyList = mutableListOf<Any>()
    val occupiedList = mutableListOf<Any>()
    val gameBoard = mutableListOf("[1, 1]", "[1, 2]","[1, 3]",
        "[2, 1]", "[2, 2]", "[2, 3]", "[3, 1]", "[3, 2]", "[3, 3]")
    var count = 2
    printBoard(listString)

    while (count <= 10) {
        emptyList.clear()
        occupiedList.clear()
        for (i in listString.indices) {
            if (listString[i] == "_" || listString[i] == "" || listString[i] == "-") {
                emptyList.add(gameBoard[i])
            } else {
                occupiedList.add(gameBoard[i])
            }
        }
        if (count % 2 == 0) {
            print("\"X\" for player ONE: Pls enter your move: ")
        } else {
            print("\"O\" for player TWO: Pls enter your move: ")
        }
        val userMove = readln().split(" ")
        if (userMove[0].toInt() > 3 || userMove[1].toInt() > 3) {
            println("Coordinates should be from 1 to 3!")
        } else if (emptyList.contains(userMove.toString())) {
            val positionMove = gameBoard.indexOf(userMove.toString())
            if (count % 2 == 0) {
                listString[positionMove] = "X"
                count++
            } else {
                listString[positionMove] = "O"
                count++
            }
            printBoard(listString)
            charsInRow(listString)
        } else if (occupiedList.contains(userMove.toString())) {
            println("This cell is occupied! Choose another one!")
        } else {
            println("You should enter numbers!")
        }
    }
    println("Draw")
}

fun printBoard(listString: MutableList<String>) {
    println("---------\n| ${listString[0]} ${listString[1]} ${listString[2]} |\n" +
            "| ${listString[3]} ${listString[4]} ${listString[5]} |\n" +
            "| ${listString[6]} ${listString[7]} ${listString[8]} |\n---------")
}

fun charsInRow(inputString: MutableList<String>) {
    val winX = (("${inputString[0]}${inputString[1]}${inputString[2]}" == "XXX") ||
            ("${inputString[0]}${inputString[3]}${inputString[6]}" == "XXX") ||
            ("${inputString[0]}${inputString[4]}${inputString[8]}" == "XXX") ||
            ("${inputString[1]}${inputString[4]}${inputString[7]}" == "XXX") ||
            ("${inputString[2]}${inputString[4]}${inputString[6]}" == "XXX") ||
            ("${inputString[2]}${inputString[5]}${inputString[8]}" == "XXX") ||
            ("${inputString[3]}${inputString[4]}${inputString[5]}" == "XXX") ||
            ("${inputString[6]}${inputString[7]}${inputString[8]}" == "XXX"))
    val winO = (("${inputString[0]}${inputString[1]}${inputString[2]}" == "OOO") ||
            ("${inputString[0]}${inputString[3]}${inputString[6]}" == "OOO") ||
            ("${inputString[0]}${inputString[4]}${inputString[8]}" == "OOO") ||
            ("${inputString[1]}${inputString[4]}${inputString[7]}" == "OOO") ||
            ("${inputString[2]}${inputString[4]}${inputString[6]}" == "OOO") ||
            ("${inputString[2]}${inputString[5]}${inputString[8]}" == "OOO") ||
            ("${inputString[3]}${inputString[4]}${inputString[5]}" == "OOO") ||
            ("${inputString[6]}${inputString[7]}${inputString[8]}" == "OOO"))
    printGameStatus(winX, winO)
}

fun printGameStatus(winX: Boolean, winO: Boolean) {
    if (winX && !winO) {
        println("X wins")
        exitProcess(10)
    }
    if (!winX && winO) {
        println("O wins")
        exitProcess(10)
    }
}
