fun calcCash(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    return (dayNumber*bugRank+42)*cashAmount
}

fun main() {
    print(calcCash(5, 15, 10000))
}