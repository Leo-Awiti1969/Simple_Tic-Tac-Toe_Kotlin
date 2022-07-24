fun main() {
    val list = mutableListOf<Int>()
    val listLeft = mutableListOf<Int>()
    val listRight = mutableListOf<Int>()
    repeat(readln().toInt()) {
        list.add(readln().toInt())
    }
    val rotate = readln().toInt()
    for (i in list.lastIndex - (rotate - 1).. list.lastIndex) {
        listLeft.add(list[i])
    }
    for (i in 0..list.lastIndex - rotate) {
        listRight.add(list[i])
    }
    for (i in 0..list.lastIndex) {
        print("${(listLeft + listRight)[i]} ")
    }
}

