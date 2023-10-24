fun getYearEra(year: Int): String{
    return if (year < 1970) "До"
    else if (year == 1970) "Соответствует"
    else if (year in 1971..1999) "После (ХХ век)"
    else if (year in 2000..2099) "После (ХХI век)"
    else "Далёкое будущее"
}

fun main() {
    print(getYearEra(1970))
}