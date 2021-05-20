fun main() {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2) // referentially equal?
    //since same string is used , it is same reference also. (JVM looks in string pool)

    println(hello1 == hello2) //structural equal?

    var money = 2988

    val ex : Any = "The Any type is the root of the kotlin class hierarchy."
    if(ex is String)
        println(ex.toUpperCase())


    val text = """1
        |11
        |111
        |1111
    """.trimMargin()
    println(text)

    val text1 = """1 1
        111
        1111
        11111
    """.trimMargin("1")

    println(text1)

}
