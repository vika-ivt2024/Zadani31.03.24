class Course(val name: String, val professor: String, val students: String) {
    fun getCourseInfo(): String {
        return "Название курса \"$name\", имя преподавателя $professor, массив именами студентов $students"
    }
}

fun main() {
    val cou = Course("Программирование","Строгонова","\nЕвгений - ИВТ-0222\nМихаил - ИВТ-0222\nРеян - ИВТ-0222\nДавид - ИВТ-0222\n")
    println(cou.getCourseInfo())
}
