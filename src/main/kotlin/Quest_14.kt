fun getLength(str: String?):Int? {
   return str?.length
}

fun main() {
    println(getLength(""))
    println(getLength("Силенок пи..."))
}