class Movie(val title: String, val director: String, val releaseYear: Int) {
    fun getMovieInfo(): String {
        return "Фильм \"$title\", режиссер $director, год выпуска $releaseYear"
    }
}
fun main() {
    val movie = Movie("Соник в кино", "Джефф Фаулер", 2020)
    println(movie.getMovieInfo())
}