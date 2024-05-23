class Menu(val name: String, val type: String, val items: String) {
    fun getMenuDetails(): String {
        return "Название меню \"$name\", тип меню $type, масссив блюд с ценой $items"
    }
}

fun main() {
    val me = Menu("Мимоза","Завтрак","\nКлубнично-банановый смузи - 150 руб.\n" +
            "Крупеник из грчки с творогом - 100 руб.\n" +
            "Тосты с рикоттой и клубникой - 170 руб.\n" +
            "Налистники с творогом и изюмом - 100 руб.")
    println(me.getMenuDetails())
}