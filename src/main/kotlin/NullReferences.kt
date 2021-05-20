
fun main() {

   // val str: String = null
    val str: String? = null

    val stra: String? = "This isnt NULL"
    if (stra != null)
        stra.uppercase()

    stra?.lowercase() // shorthand

    val newstr: String? = null
    println(newstr)
    //println(newstr.uppercase()) ->

        //val countryCode: String? = bankBranch?.address?.country?.countryCode ->  null safe declaration
    // ?: elvis operator for default value
    val str2 = str ?: "This is a default value"
    println(str2)

    //val countryCode: String? = bankBranch?.address?.country?.countryCode ?: "IN"

    val something : Any = arrayOf(1,2,4,6)
    val str3 = something as? String
    println(str3)

    val stro:String? = "Asdasfa"
    //println(stro.uppercase())
    println(stro!!.uppercase())
}
