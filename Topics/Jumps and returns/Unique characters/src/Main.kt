fun main() {
    val theString = readln()
    var newString = ""
    for (i in theString.indices) {
        if (theString[i] in newString)
            continue
        newString += theString[i]
    }
    print(newString)
}

//for (i in 1..4) {
//    loop@ for (j in 1..3) {
//        for (k in 1..2) {
//            if (i == 2 || j == 3 || k == 2) break@loop
//            print("$k")
//        }
//    }
//}