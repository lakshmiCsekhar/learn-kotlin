import javacode.Dummy
import java.math.BigDecimal

fun main() {

    var names = arrayOf("John" , "Jane" , "Mary")
    println(names)

    var longs = arrayOf(1L,2L,3L)
    var longs1 = arrayOf<Long>(1,2,3)
    var longs2 = arrayOf(1,2,3)



    println(longs is Array<Long>)
    println(longs1 is Array<Long>)

    println(longs2[2])

    var evenNumbers = Array (16){i -> i * 2 }
    for (number in evenNumbers)
        println(number)

    val allZeros = Array (10) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4,5)

    val mixedArray = arrayOf( "hello" , 12 , BigDecimal(10.8) ,'a')
    println(mixedArray is Array<*>)

    val myIntArray = arrayOf(100,200,300,400,500)
   // Dummy().printNumbers(myIntArray) ------> cant use this to call java

    val newIntArray = intArrayOf(300,700,800,1000)
   // Dummy().printNumbers(newIntArray)  todo
    //Dummy().printNumbers(evenNumbers.toIntArray())

}
