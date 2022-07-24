fun main() {
    val companyList = mutableListOf<Int>()
    val percentageList = mutableListOf<Int>()
    val numOfCompany = readln().toInt()
    val incomeList = mutableListOf<Int>()

    repeat(numOfCompany) {
        companyList.add(readln().toInt())
    }
    repeat(numOfCompany) {
        percentageList.add(readln().toInt())
    }

    for (i in 0 until companyList.size) {
        incomeList.add(companyList[i] * percentageList[i])
    }
    val maxNum = incomeList.sortedWith(compareBy { it }).last()
    println(incomeList.indexOf(maxNum) + 1)
}