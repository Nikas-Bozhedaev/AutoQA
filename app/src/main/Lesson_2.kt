fun main() {
    println("Введите целое число")
    var number = readLine()?.toIntOrNull() ?:0

    if (number == 0) {
        println("Введенное число равно нулю")
    }
    else if (number > 1) {
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
}