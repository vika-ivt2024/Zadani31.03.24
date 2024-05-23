class TourPackage(val destination: String, val days: Int, val price: Int,val activities:String) {
    fun getMovieInfo(): String {
        return "пункт назначения \"$destination\", количество дней $days, цена $price,массив строк с перечнем активностей во время тура $activities"
    }
}
fun main() {
    val movie = TourPackage("Республика Корея", 10, 5000, "\n1)со скалолазанием\n2)с экстрим-парком «Каньон»\n3)с пейнтболом")
    println(movie.getMovieInfo())
}