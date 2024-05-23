class LibraryBook(val isbn: String, val title: String, val author: String) {
    fun getBookDetails(): String {
        return "Международный стагдартный книжный номер \"$isbn\", название $title, автор $author"
    }
}

fun main() {
    val book = LibraryBook("31434121","О цвете","теренс Конран")
    println(book.getBookDetails())
}