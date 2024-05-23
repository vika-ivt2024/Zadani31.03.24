class MusicInstrument(val type: String, val name: String, val yearOfManufacture: Int) {
    fun getMovieInfo(): String {
        return "тип \"$type\", название иструмента $name, год изоготовления $yearOfManufacture"
    }
}

fun main() {
    val music = MusicInstrument("Струнные", "Гитара", 2022)
    println(music.getMovieInfo())
}