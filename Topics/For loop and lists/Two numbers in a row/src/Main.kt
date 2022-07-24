import kotlin.math.abs

fun main() {
    val listSize = readln().toInt()
    val integerList = mutableListOf<Int>()
    repeat(listSize) {
        integerList+= readln().toInt()
    }
    val (p, m) = readLine()!!.split(" ")

    if (abs(integerList.indexOf(p.toInt()) - integerList.indexOf(m.toInt())) == 1) {
        println("NO")
    } else {
        println("YES")
    }
}