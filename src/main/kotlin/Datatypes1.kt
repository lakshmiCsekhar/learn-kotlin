fun main() {
    //int is default
    val myInt = 65
    println(myInt is Int)
    var myLong = 22L

    //in java int can convert/widen to long

   // myLong = myInt  cant do this

    myLong = myInt.toLong()

    val myByte : Byte = 111

    var myShort : Short
    myShort = myByte.toShort()

    //numeric literals can be widened

    val anotherInt = 5

    var myDouble = 65.678

    val myFloat = 534.456f
    println(myFloat is Float)

    myDouble = myFloat.toDouble()

    val char:Char = 'b'
    //val myChar: Char = 65 - cant assign numeric value like in java

    println(myInt.toChar())

    var myBoolean = true

    var abc = Unit // equivalent to void in java (but it returns a singleton instance of unit)


}
