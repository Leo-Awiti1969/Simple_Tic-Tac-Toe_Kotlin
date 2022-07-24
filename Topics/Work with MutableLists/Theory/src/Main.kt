// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val mutList2D = mutableListOf(
        mutableListOf<Int>(0, 0, 0, 0),
        mutableListOf<Int>(0, 0, 0, 0),
        mutableListOf<Int>(0, 0, 0, 0)
    )
    print(mutList2D[0].joinToString(" "))

    val mutListOfString2D = mutableListOf(
        mutableListOf<String>("to", "be", "or"),
        mutableListOf<String>("not", "to", "be")
    )
    println(mutListOfString2D[0].joinToString(" "))
}
