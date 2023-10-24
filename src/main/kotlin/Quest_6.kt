fun calculateEvenDigits(request: String): Int {
    var sum: Int = 0
    for (c in request) {
        if (c.digitToInt()%2 == 0) {
            sum += c.digitToInt()
        }
    }
    return sum
}

fun main() {
    print(calculateEvenDigits("11111111111"))
}