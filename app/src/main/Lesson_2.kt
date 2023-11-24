class PasswordException : Exception("Пароль неверный")

fun main() {
    // Задание 1
    println("Введите целое число")
    var number = readLine()?.toIntOrNull() ?:0

    if (number == 0) {
        println("Введенное число равно нулю")
    }
    else if (number >= 1) {
        if (number % 2 == 0) {
            println("Введенное число ${number} является положительным и четным")
        }
        else {
            println("Введенное число ${number} является положительным и не четным")
        }
    }
    else {
        println("Введенное число ${number} является отрицательным")
    }
    // Сделаем тоже самое с WHEN
    println("Введите число еще раз :)")
    var number2 = readLine()?.toIntOrNull() ?:0

    when (number2) {
        0 -> println("Введенное число равно нулю")
        in 1..Int.MAX_VALUE -> println("Введенное число больше нуля")
        else -> println("Введенное число меньше нуля")
    }
    // Задание 2
    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (x in numbers) {
        println("Квадрат числа ${x} равен ${x*x}")
    }
    
    var y = 0

    while (y <= 9) {
        println("Куб числа ${numbers[y]} равен ${numbers[y]*numbers[y]*numbers[y]}")
        y++
    }

    repeat(10) { i -> 
        println("Привет, мир ${i}")
    }
    // Задание 3.1
    fun sum(numbers1: Array<Int>): Int {
        var sumNumbers = 0
    
        for (number3 in numbers1) {
            if (number3 > 10) {
                sumNumbers += number3
            }
            else if (number3 < 0) {
                return sumNumbers
            }
        }
            return sumNumbers 
    }
    var numbersArray = arrayOf(10, 25, 36, 17, -2, 17) 
    var result = sum(numbersArray)
    println(result)   
    // Задание 3.2
    for (numbers2 in 1..10) {
        if (numbers2 == 3 || numbers2 == 7) {
            continue
        }
        println(numbers2)
    }
    // Задание 3.3 - Поменялось :(
        println("Введите целевое число")
        var target_number = readLine()?.toIntOrNull() ?:0
        var found = false
        var col: Int? = null
        var row: Int? = null

        val matrix = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
        arrayOf(16, 17, 18, 19, 20),
        arrayOf(21, 22, 23, 24, 25)
    )

    for (x in matrix.indices) {
        for (y in matrix.indices) {
            if (target_number == matrix[x][y]) {
                found = true
                col = y + 1
                row = x + 1
                break
            }
        }
    }

    if (found) {
        println("Целевое число ${target_number} найдено в колонке ${col} и строке ${row}")
    }
    else {
        println("Целевое число не найдено!")
    }

    // Задание 4.1
    try {
        println("Введите число")  
        var number5 = readLine()?.toInt() ?: 0 
       } catch (e: Exception) {
        println("Ошибка: Введите число!") 
       } finally {
        println("Конец программы") 
       }
    // Задание 4.2
    try {
        var password = "test2023" 
           
        println("Введите пароль") 
        var inputPassword = readLine()
        
        if (inputPassword == password) {
            println("Пароль верный") 
            } 
        else {
            throw PasswordException() 
            } 
        } catch (e: PasswordException) {
            println("Пароль неверный")
            e.printStackTrace() 
        } 
   } 