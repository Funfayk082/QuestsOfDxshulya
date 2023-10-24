class SugarStorage(public var volume: Int) {
    public fun decreaseSugar(v: Int) {
        if (volume-v >= 0 && v >= 0)  volume -= v
        else if (v >= 0) {
            volume = 0
        }
    }

    public fun increaseSugar(v: Int) {
        if (v >= 0)  volume += v
    }
}

fun main() {
    val sugarStorage = SugarStorage(100)
    sugarStorage.decreaseSugar(-10)
    println("Текущий баланс хранилища: ${sugarStorage.volume}")

    sugarStorage.increaseSugar(-20)
    println("Текущий баланс хранилища: ${sugarStorage.volume}")
}