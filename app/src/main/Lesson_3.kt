fun main () {
    // Задание 1
    fun maxOfTwo(numberOne: Int, numberTwo: Int): Int {        
        return if (numberOne > numberTwo) {
            numberOne 
        }
        else {
            numberTwo
        }   
    }
   
    println("Введите первое число")
    var inputNumberOne = readLine()?.toIntOrNull() ?:0
       
    println("Введите второе число")
    var inputNumberTwo = readLine()?.toIntOrNull() ?:0
   
    var result = maxOfTwo(inputNumberOne, inputNumberTwo)
   
    println("Большее число - ${result}")
       
    //Задание 2
    fun sayHello (name: String = "Мир"): String {
        return "Хеллоу, ${name}"
    }
       
    println ("Введите ваше имя") 
    var inputName = readLine() ?: "Юзер" 
       
    println(sayHello()) 
    println(sayHello(inputName)) 
       
    //Задание 3
    infix fun Int.isGreater (other: Int): Boolean {
        return this > other 
    }
    
    println("Введите первое число")
    var firstNumber = readLine()?.toIntOrNull() ?:0
       
    println("Введите второе число")
    var secondNumber = readLine()?.toIntOrNull() ?:0
       
    var resultBoolean = firstNumber isGreater secondNumber 
    println(resultBoolean)
       
    // Задание 4 
    tailrec fun generateSequence(maxValue: Int, minValue: Int = 1): List<Int> {
        return if (minValue > maxValue) {
            emptyList() 
        } 
        else {
            listOf(minValue) + generateSequence(maxValue, minValue + 1) 
        }
    }
       
    println("Введите верхнюю границу диапазона") 
    var inputMaxValue = readLine()?.toIntOrNull() ?:0
           
    var resultRecursian = generateSequence(inputMaxValue)
           
    println(resultRecursian) 
       
    // Задание 5
    var nameList = mutableListOf("Никита") 
       
    nameList.let {
        println("Введите имя")
        var firstName = readLine() ?:"Имя не введено"    
        it.add(firstName) 
    } 
       
    nameList.run {
        println("Введите чьё-нибудь имя")
        var secondName = readLine() ?:"Имя не введено" 
        add(secondName) 
    }
       
    nameList.also {
        it.removeAt(1) 
    }
       
    nameList.apply {
        nameList = reversed().toMutableList() 
    }
           
    with(nameList) {
        println("Введите ещё чьё-нибудь имя")
        var thirstName = readLine() ?:"Имя не введено" 
        add(thirstName) 
    }
       
    println(nameList) 
}