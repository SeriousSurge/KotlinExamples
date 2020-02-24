/**created by mark nolan on 24/02/2020 **/
package demo

import java.lang.IllegalArgumentException
import java.util.Random


fun main (args : Array<String>) {
//    println("Hello World")
//

    /** Intro to vars and vals**/
//    val name = "Mark"
//
//    var age = 25
//
//    var bigInt: Int = Int.MAX_VALUE
//    var smallInt: Int = Int.MIN_VALUE
//
//    println("Biggest Int : " + bigInt)
//    println("Biggest Int : $smallInt")
//
//    var dblNum1: Double = 1.111111111111111111
//    var dblNum2: Double = 1.111111111111111111
//
//    println("Sum : " + (dblNum1 + dblNum2))
//
//    if(true is Boolean){
//        print("true is boolean \n")
//    }
//
    /** comparisons and type casting **/
//    var letterGrade: Char = 'A'
//
//    println("A is a Char : ${letterGrade is Char}")
//
//    println("3.14 to Int : " + (3.14.toInt()))
//
//    println("A to int : " + ('A'.toInt()))
//    println("A to int : " + ('A'.toInt()))
//    println("65 to char : " + (65.toChar()))
//
//    val longStr = """This is a
//     long string of length
//     3""".trimIndent()
//
//    var str1 = "A random string"
//    var str2 = "a random string"
//
//    println("2nd index: ${str1[2]}")
//
//    println("Index 2 - 7 : ${str1.subSequence(2,9)}")
//
//    println("Contains random :  ${str1.contains("random")}")

/** Arrays and shit **/
//    var myArray = arrayOf(1, 1.23, "Doug")
//
//    println(myArray[2])
//
//    myArray[1] = 3.14
//
//    println("Array Length : ${myArray.size}")
//
//    println("Doug in Array : ${myArray.contains("Doug")}")
//
//    var partArray = myArray.copyOfRange(0, 1)
//
//    println("First : ${myArray.first()}")
//
//    println("Doug Index : ${myArray.indexOf("Doug")}")
//
//    var sqArray = Array(5, {x -> x * x})
//    println(sqArray[4])
//
//    var arr2: Array<Int> = arrayOf(1,2,3)

/** Ranges etc. **/
//    val oneTo10 = 1..10
//
//    val alpha = "A" .."Z"
//
//    println("R in Alpha : ${"R" in alpha}")
//
//    val tenTo1 = 10.downTo(1)
//
//    val twoTo20 = 2.rangeTo(20)
//
//    val rng3 = oneTo10.step(3)
//
//    for(x in rng3) println("rng3 : $x")
//
//    for(x in tenTo1.reversed()) println("Reverse : $x")

    /** Conditionals **/

//    val age = 8
//
//    if(age < 5 ){
//        println("Go to Preschool")
//    }else if(age == 5){
//        println("Go to Kindergerten")
//    }else if((age > 5) && (age <= 17)){
//        val grade = age - 5
//        println("Go to grade $grade")
//    }else {
//        println("Go To College")
//    }
//
//    when(age){
//        0,1,2,3,4 -> println("Go to Preschool")
//
//        5 -> println("Go to Preschool")
//
//        in 6..17 -> {
//            val grade = age - 5
//            println("Go To Grade : $grade")
//        }
//
//        else -> println("Go To college")
//    }

    /** Looping **/

//    for(x in 1..10){
//        println("loop : $x")
//    }
//
//    val rand = Random()
//    val magicNum = rand.nextInt(50) + 1
//
//    var guess = 0
//
//    while(magicNum != guess){
//        guess += 1
//    }
//
//    println("MagicNumber was $guess")
//
//    for (x in 1..20){
//        if(x % 2 ==0){
//            continue
//        }
//
//        println("Odd : $x")
//
//        if(x == 15) break
//    }
//
//    var arr3: Array<Int> = arrayOf(3,6,9)
//
//    for (i in arr3.indices){
//        println("Multi 3 : ${arr3[i]}")
//    }
//
//    for((index, value) in arr3.withIndex()) {
//        println("Index : $index value : $value ")
//    }

    /** functions **/

//    fun add(num1 : Int, num2: Int) : Int = num1 + num2
//    println("5 + 4 = ${add(5,4)}")
//
//    fun subtract(num1 : Int = 1, num2: Int = 1) = num1 - num2
//    println("5 - 1 = ${subtract(5)}")
//
//    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")
//
//    val(two, three) = nextTwo(1)
//    println("1, $two , $three")
//
//    fun sayHello(name : String) : Unit = println("Hello $name")
//    sayHello("Paul")
//
//    println("Sum = ${getSum(1,2,3,4,5)}")
//
//    val multiply = {num1: Int, num2: Int -> num1 * num2}
//
//    println("5 * 3 = ${multiply(5,3)}")
//
//    println("5! : ${fact(5)}")

//    val numList = 1..20
//
//    val evenList = numList.filter { it % 2 == 0 }
//    evenList.forEach{ n -> println(n)}
//
//    val mult3 = makeMathFunction(3)
//    val mult5 = makeMathFunction(5)
//
//    println("5 * 3 = ${mult3(5)}")
//    println("5 * 5 = ${mult5(5)}")
//
//    val multiply2 = {num1: Int -> num1 * 2}
//
//    val numList2 = arrayOf(1,2,3,4,5)
//    mathOnList(numList2, multiply2)

    /** useful **/
//    val numList2 = 1..20
//
//    val listSum = numList2.reduce { x, y -> x + y}
//    println("Reduce Sum : $listSum")
//
//    val listSum2 = numList2.fold(5) { x, y -> x + y}
//    println("Fold Sum : $listSum2")
//
//    println("Evens : ${numList2.any { it % 2 == 0}}")
//    println("Evens : ${numList2.all { it % 2 == 0}}")
//
//    val big3 = numList2.filter { it > 3 }
//
//    big3.forEach{ n -> println(">3 : $n")}
//
//    val times7 = numList2.map {it * 7}
//    times7.forEach { n -> println("times7 : $n")}

    /** Exceptions **/

//    val divisor = 0
//
////    try{
//        if( divisor == 0){
//            throw IllegalArgumentException("Can't Divide by Zero")
//        } else {
//            println("5 / $divisor = ${5/divisor}")
//        }
//    } catch (e: IllegalArgumentException){
//        println("${e.message}")
//    }

    /** Sum Collections **/

//    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
//
//    var list2: List<Int> = listOf(1,2,3,4,5)
//
//    list1.add(6)
//
//    println("first : ${list1.first()}")
//    println("last : ${list1.last()}")
//
//    println("2nd : ${list1[2]}")
//
//    var list3 = list1.subList(0, 3)
//
//    println("Length : ${list1.size} ")
//
//    list3.clear()
//
//    list1.remove(1)
//
//    list1.removeAt(1)
//
//    list1[1] = 20
//
//    list1.forEach { n -> println("Mutable List ; $n")}

    /** Maps**/

//    val map = mutableMapOf<Int, Any?>()
//
//    val map2 = mutableMapOf(1 to "Doug", 2 to 25)
//
//    map[1] = "Mark"
//    map[2] = 42
//
//    println("Map Size : ${map.size}")
//
//    map.put(3, "Dublin")
//
//    map.remove(2)
//
//    for((x,y) in map){
//        println("key : $x Value : $y")
//    }
//    val bowser = Animal("Bowser", 20.0, 13.5)
//    println(bowser.toString())
//    bowser.getInfo()
//
//    val spot = Dog("spot", 20.0, 15.5, "Mark Nolan")
//    spot.getInfo()
//
//    val tweety = Bird("Tweety", true)
//
//    tweety.fly(10.0)

    /** Null Safety **/
//
//    var nullVal: String? = null
//
//    fun returnNull(): String?{
//        return null
//    }
//
//    var nullVal3 = returnNull()
//
//    if(nullVal3 != null){
//        println("value is ${nullVal3.length}")
//    }
//
//    var nullVal4: String = returnNull() ?: "No Name"

}


//fun nextTwo(num: Int): Pair<Int, Int>{
//    return Pair(num+1, num+2)
//}
//
//fun getSum(vararg nums: Int): Int
//{
//    var sum = 0
//
//    nums.forEach { n -> sum += n }
//
//    return sum
//}
//
//fun fact(x: Int): Int{
//    tailrec fun factTail(y: Int, z: Int): Int {
//        if(y == 0) return z
//        else return factTail(y - 1, y * z)
//    }
//    return factTail(x, 1)
//}

//fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
//
//fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
//    for(num in numList){
//        println("mathOnList ${myFunc(num)} ")
//    }
//}

/** Test Classes and interfaces **/
//open
//data class Animal(val name: String,
//                  var height: Double,
//                  var weight: Double){
//    init{
//        val regex = Regex(".*\\d+.*")
//
//        require(!name.matches(regex)){"Animal Name can't contain numbers"}
//
//        require(height > 0) { "height must be greater than 0"}
//        require(weight > 0) { "weight must be greater than 0"}
//    }
//
//    open fun getInfo(): Unit
//    {
//        println("$name is $height tall and weighs $weight")
//    }
//}
//
//class Dog(name: String,
//          height: Double,
//          weight: Double,
//          var owner: String) : Animal(name, height, weight ){
//
//    override fun getInfo(): Unit
//    {
//        println("$name is $height tall and weighs $weight and is owned by $owner")
//    }
//
//}
//
//interface Flyable {
//    var flies: Boolean
//    fun fly(distMiles: Double): Unit
//
//}
//
//class Bird constructor(val name: String,
//                       override var flies: Boolean = true)
//    : Flyable{
//    override fun fly(distMiles: Double): Unit
//    {
//        if(flies){
//            println("$name flies $distMiles miles")
//        }
//    }
//}

