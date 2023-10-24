fun calculateBugMentions(request: List<String>): Int {
    var count: Int = 0
    for(e: String in request) {
        if (e.equals("BUG")) count++
    }
    return count
}

fun main() {
    var list: List<String> = listOf("1", "BUG", "2", "3", "BUG", "BUG", "BUG", "BUG", "BUG", "4")
    print(calculateBugMentions(list))
}
