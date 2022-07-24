fun main() {
    val originalList = mutableListOf<Int>()
    repeat(readln().toInt()) {
        originalList.add(readln().toInt())
    }
    val fistValue = originalList[originalList.size - 1]
    originalList.removeLast()

    print("$fistValue ")
    for (i in 0 until originalList.size) {
        print("${originalList[i]} ")
    }
}