//Задание 1
class Car(val model: String, val color: String, val year: Int) {
    fun drive(){
        println("Поехали на ${model} ${color} ${year} лет")
    }
}

// Задание 2 
enum class DayOfWeek (val value: Int, val russianName: String) {
    MONDAY(1, "Понедельник"), 
    TUESDAY(2, "Вторник"), 
    WEDNESDAY(3, "Среда"), 
    THURSDAY(4, "Четверг"), 
    FRIDAY(5, "Пятница"), 
    SATURDAY(6, "Суббота"), 
    SUNDAY(7, "Воскресенье");
}

// Задание 2 (Второй вариант)
enum class DayOfWeek1{
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY, 
    SUNDAY;
}

// Задание 3
object Singleton {
    fun printMessage() {
        println("Любое сообщение")
    }
}

// Задание 4 
class Person {
    private var name: String = "Имя не установлено" 
    private var age: Int = 28
    
    public fun getName() {
        println("${name}")
    }

    public fun getAge() {
        println("${age}")
    }
}

// Задание 5 
class Person1 {
    var name: String = "Неизвестный" 
        set(value) {
            field = value
        }
        get() {
            return field
        }
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value 
            }
            else {
                println("Возраст не может быть отрицательным") 
            }
        }
        get() {
            return field 
        }
}

// Задание 6
open class Animal {
    open fun makeSound() {
        println("Животное издаёт звук") 
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Собака гавкает")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Кошка мяукает")
    }
}

// Задание 7
class mathUtils {
    fun add(number1: Int , number2: Int) {
        println("${number1}, ${number2}")
    }
    fun add(number1: Int, number2: Int, number3: Int ) {
        println("${number1}, ${number2}, ${number3}")
    }
}

// Задание 8
abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Int) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

class Rectangle(private val a: Int, private val b: Int) : Shape() {
    override fun area(): Double {
        return (a * b).toDouble()
    }
}

// Задание 9
interface Flyable {
    fun fly(): String 
}

interface Navigable {
    fun navigate(): String 
}

class Bird : Flyable, Navigable {
    override fun fly(): String {
        return "Летает с помощью крыльев"
    }
    override fun navigate(): String {
        return "Ориентируется с помощью солнца"
    }
}

class Airplane : Flyable, Navigable {
    override fun fly(): String {
        return "Летает с помощью двигателя"
    }
    override fun navigate(): String {
        return "Ориентируется с помощью карты"
    }
}

// Задание 10
data class  User(val name: String, val age: Int) {
    fun printInfo() {
        println("Имя - ${name}, Возраст - ${age}")
    }
}

// Задание 11
sealed class mathOperation {

    data class Add(private val a: Int, private val b: Int) : mathOperation() {
        fun add(): Int {
            return a + b
        }
    }
    data class Substract(private val a: Int, private val b: Int) : mathOperation() {
    fun substract(): Int {
        return a - b
        }
    }
    data class Multiply(private val a: Int, private val b: Int) : mathOperation() {
    fun multiply(): Int {
        return a * b
        }
    }
    data class Divide(private val a: Int, private val b: Int) : mathOperation() {
        fun divide(): Int {
        return a / b
        }
    }
}

// Задание 12
class Mammal {
    fun breastfeed() {
        println("Кушаем")
    }
}

class CanFly {
    fun fly() {
        println("Летаем")
    }
}

class Bat(private val mammal: Mammal = Mammal(), private val canfly: CanFly = CanFly()) {
    fun breastfeed() {
        println("Летучая мышь кушает")
    }
    fun fly() {
        println("Летучая мышь летает")
    }
}

// Задание 13
class Engine {
    fun engine() {
        println("Двигатель заведен")
    } 
}
   
class Tires {
    fun tires() {
        println("Колеса поставлены")
    }
}
   
class Car2(private val engine: Engine, private val tires: Tires) {
    fun start() {
        engine.engine()
        tires.tires()
        println("Поехали")
    }
}
   
// Задание 14
interface Repository<T> {
    fun save(item: T)
    fun delete(item: T) 
    fun getAll(): List<T> 
}
   
data class User2(val name: String, val age: Int)
   
class UserRepository: Repository<User2> {
    private val userList: MutableList<User2> = mutableListOf()
       
    override fun save(item: User2) {
        userList.add(item)
    }
    override fun delete(item: User2) {
        userList.remove(item)
    }
    override fun getAll(): List<User2> {
        return userList.toList()
    }
}

fun main() {
    // Задание 1
    val myCar = Car("Zhiguli", "Visnyovue", 25)

    myCar.drive()

    println("Введите модель машины")
    var youCarModel = readLine() ?: "Модель не названа"

    println("Введите цвет машины")
    var youCarColor = readLine() ?: "Цвет не назван"

    println("Введите возраст машины")
    var youCarYear = readLine()?.toIntOrNull() ?:0

    val yourCar = Car(youCarModel, youCarColor, youCarYear)

    yourCar.drive()
    
    // Задание 2
    for (day in DayOfWeek.values()) {
        println("${day.russianName} - ${day.value} день недели")
    }

    // Задание 2 (Второй вариант)
    DayOfWeek1.values().forEach {
        println(it.name)
    }

    // Задание 3
    Singleton.printMessage()

    // Задание 4 
    val jack = Person()
    jack.getName()
    jack.getAge()

    // Задание 5 
    val mike = Person1() 
    mike.name = "Mike Tyson"
    mike.age = -2
    mike.age = 35
    println(mike.name) 
    println(mike.age)
    
    // Задание 6
    val animal = Animal()
    animal.makeSound()
    
    val cat = Cat()
    cat.makeSound()
    
    val dog = Dog()
    dog.makeSound()
    
    // Задание 7
    val math = mathUtils()
    math.add(1, 2)
    math.add(1, 2, 3)
    
    // Задание 8
    val circle = Circle(5)
    println(circle.area())
    
    val rectangle = Rectangle(2, 6)
    println(rectangle.area())
    
    // Задание 9
    val bird = Bird()
    println("Птица ${bird.fly()} и ${bird.navigate()}")
    
    val airplane = Airplane()
    println("Самолёт ${airplane.fly()} и ${airplane.navigate()}")
    
    // Задание 10
    val userJohn = User("John Lenon", 150)
    userJohn.printInfo()
    
    // Задание 11
    val operationAdd = mathOperation.Add(2, 2)
    val resultAdd = operationAdd.add()
    println(resultAdd)
    
    val operationSubstract = mathOperation.Substract(5, 2)
    val resultSubstract = operationSubstract.substract()
    println(resultSubstract)
    
    val operationMultiply = mathOperation.Multiply(6, 2)
    val resultMultiply = operationMultiply.multiply()
    println(resultMultiply)
   
    val operationDivide = mathOperation.Divide(10, 2)
    val resultDivide = operationDivide.divide()
    println(resultDivide)
    
    // Задание 12
    val batMammal = Mammal()
    val batCanfly = CanFly()
    val bat = Bat(batMammal, batCanfly)
    
    bat.fly()
    bat.breastfeed()

    // Задание 13
    val myCar2 = Car2(Engine(), Tires())
    myCar2.start()
    
    // Задание 14
    val user1 = User2("Шершняга", 22)
    val user2 = User2("Роза Робот", 21)
    val user3 = User2("Инженер", 20)
    
    val userRepository = UserRepository()
    
    userRepository.save(user1)
    userRepository.save(user2)
    userRepository.save(user3)
    
    userRepository.delete(user3)
    
    println(userRepository.getAll())
}




