class Playlist(val name: String, val genre: String, val songs: String) {
    fun getPlaylistDetails(): String {
        return "Название плейлиста \"$name\", жанр музыки $genre, Массив песен $songs"
    }
}
fun main() {
    val play = Playlist("Mastodon","прогрессивный метал, сладж-метал, грув-метал","\nThe Sparrow\n" +
            "Creature Lives\n" +
            "Octopus Has No Friends")
    println(play.getPlaylistDetails())
}