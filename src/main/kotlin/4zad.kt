class Athlete(val name: String, val sport: String, val country: String) {
    fun getAthleteInfo(): String {
        return "имя спортсмена \"$name\", вид спорта $sport, страна $country"
    }
}

fun main() {
    val sp = Athlete("Светлана Гладышева","Горные лыжи","Россия")
    println(sp.getAthleteInfo())
}
