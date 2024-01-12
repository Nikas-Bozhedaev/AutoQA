fun main() {
    // Задание 1
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
       
    fun filter(numbers: List<Int>): List<Int> {
        var filterNumbers = mutableListOf<Int>()
        for (number in numbers) {
            if (number % 2 == 0) {
                filterNumbers.add(number)
            }
        }
        return filterNumbers 
    }
       
    val result1 = filter(numbers)
    println(result1)
       
    // Задание 2
    val stringNumbers: List<String> = listOf("один" , "два" , "три" , "четыре" , "пять") 
       
    fun createMap(stringNumbers: List<String>): Map<String, Int> {
        var countElements = mutableMapOf<String, Int>()
           
        for (stringNumber in stringNumbers) {
            var elementsFromWords = 0
            for (elements in stringNumber) {
                elementsFromWords += 1
            }
            countElements[stringNumber] = elementsFromWords 
        }
        return countElements 
    }
       
    val result2 = createMap(stringNumbers)
    println(result2)
       
    // Задание 3
    fun changeString(a: Int, toString: (Int) -> String = {a -> "Преобразование ${a} в строку"}): String { 
        return toString(a)
    } 
       
    println(changeString(8))
       
    // Задание 4 
    var changeToSquare: (Int) -> Int = {a -> a*a}
       
    fun printSquare(a: Int): String {
        var square = changeToSquare(a)
           
        return "Квадрат ${a} равен ${square}"
    }
       
    println(printSquare(2))
       
    // Задание 5
    data class Person(val name: String, val age: Int) 
       
    var listPerson = mutableListOf<Person>() 
       
    val person1 = Person("Клава", 47)
    val person2 = Person(" Шура", 54)
    val person3 = Person("Сеня", 25)
    val person4 = Person("Андромеда", 17)
    val person5 = Person("Ефросинья", 16)
       
    listPerson.addAll(listOf(person1, person2, person3, person4, person5))
       
    val filterList = listPerson.filter {it.age > 18}
    val nameFilterList = filterList.map {it.name}
       
    println(nameFilterList)
       
    // Задание 6
    val bigList = (1..1000).asSequence()
        .filter {
            it % 5 == 0
        }
        .map {
            it * 2
        }
       
    var resultSequence = bigList.take(20).toList()
    println(resultSequence)
       
    // Задание 7
    data class Car(val make: String, val model: String, val year: Int) 
       
    var listCar = listOf<Car>(
        Car("Едет", "Ласточка", 2001), 
        Car("Стоит", "Малышка", 2015), 
        Car("Тормозит", "Красотка", 2015), 
        Car("Ломается", "Железяка", 2001), 
        Car("Ржавеет", "Корыто", 1960) 
    )
       
    val carGroupedByYear = listCar.groupBy {it.year}
       
    for (nameCar in carGroupedByYear) {
        val model = nameCar.value.map {it.model}
        val year = nameCar.key
           
        println("${model} ${year} года")
    }
       
    // Задание 8
    val lazyValue: String by lazy {
        println("Первая инициализация")
        "Инициализация из кэша" 
    }
       
    println(lazyValue)
    println(lazyValue)
       
    // Задание 9
        fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }
       
    val add = {x: Int, y: Int -> x + y}
    val multiply = {x: Int, y: Int -> x * y}
    val divide = {x: Int, y: Int -> x / y}
    val subtraction = {x: Int, y: Int -> x - y}
       
    println(calculate(2, 2, add))
    println(calculate(10, 2, multiply))
    println(calculate(10, 5, divide))
    println(calculate(4, 2, subtraction))
       
    // Задание 10
    var numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
       
    val sum = numberList.reduce {acc, i -> acc + i}
    val min = numberList.reduce {acc, i -> if (i < acc) i else acc}
    val max = numberList.reduce {acc, i -> if(i > acc) i else acc}
       
    println("Сумма всех чисел списка ${sum}")
    println("Минимальное значение списка ${min}")
    println("Максимальное значение списка ${max}")
}