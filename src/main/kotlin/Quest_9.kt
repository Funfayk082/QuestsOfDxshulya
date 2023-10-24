public class NibirunianClass(public var namePlate: String) {
    public fun createNamePlate(name: String) {
        namePlate = "Живи долго и счастливо, " + name
    }
}

fun main() {
    var nibirunianClass: NibirunianClass = NibirunianClass("Иди нахуй, Силенок")
    nibirunianClass.createNamePlate("Ярик")
    print(nibirunianClass.namePlate)
}