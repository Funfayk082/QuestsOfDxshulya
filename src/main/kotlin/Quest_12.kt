public fun getCubeList(range: Int): MutableList<Int> {
    var result: MutableList<Int> = mutableListOf()
    for (i in 0..range-1) {
        result.add(i*i*i)
    }
    return result
}