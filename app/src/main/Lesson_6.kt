fun main() {
    // Задание 1
    val a: String? = null
    
    // Способ раз
    val b: Int? = a?.length
    // Способ два
    val c: Int? = a?.length ?: 0
    
    // Задание 2
    //fun main() {
        //val nullableList: List<Int?> = listOf(1, 2, null, 4)
        //val intList: List<Int> = nullableList.filterNotNull()
        //println(intList)
    //}
    // Этот код создаст новый список intList, который будет содержать ненулевые значения из списка nullableList, то есть - 1, 2, 4
    
    // Задание 3
    var s: String? = null 
    
    var d: String = s ?: "empty" 
    
    // Задание 4
    fun nullableFunction (e: String? = null) {
        val notNull: Int = e!!.length
    }
    // Если вызвать функцию с null, то будет исключение NullPointerException
    
    // Задание 5
    class InvalidUserInputException(message: String): Exception(message)
    
    try {
    println("Введите пароль")
        val password = readLine() ?: "Пароль не введен" 
        
        println("Повторите пароль")
        val passwordTry = readLine() ?: "Пароль не введен"
        
        if (password != passwordTry) {
            throw InvalidUserInputException("Введенные пароли не совпадают")
        }
        else {
            println("Пароль успешно подтвержен")
        }
    } catch (e: Exception) {
        println(e.message)
    }
}