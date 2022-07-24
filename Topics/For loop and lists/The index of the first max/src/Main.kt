fun main() {
    val companyList = mutableListOf<Int>()
    val numOfCompany = readln().toInt()

    repeat(numOfCompany) {
        companyList.add(readln().toInt())
    }

    val maxNum = companyList.sortedWith(compareBy { it }).last()
    println(companyList.indexOf(maxNum))
}