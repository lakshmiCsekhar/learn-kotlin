typealias EmployeeSet = Set<Employee>

fun main() {


    //tools -> kotlin -> repel


    val employee1 = Employee ("John",100)
    val employee2 = Employee ("Mary",2)
    val employee3 = Employee ("Mary",2)

    println(employee1)
    val change = 4.22
    println("to show the value of change , we use $change")

    println("to show the value of change , we use \$change") // escape
    println("your change is $")
    println("your change is $$change")

    val numerator = 10.99
    val denominator = 20.00

    println("value of $numerator divided by $denominator is ${numerator/denominator}")
    println("employee 1s id is ${employee1.id}")

    var filePath = """c:\\somedir\somedir2""" //use """ to escape

    var ryme = """Humpty dumpty 
       sat on a wall 
       wlasrderer
    """
    println(ryme) // indentation problems

    var rymes = """Humpty dumpty 
                 |sat on a wall 
                 |wlasrderer
    """.trimMargin()
    println(rymes)
    val eddName = "Humpty"
    var rymes1 = """$eddName dumpty 
                 |sat on a wall 
                 |wlasrderer $eddName
    """.trimMargin()
    println(rymes1)



/*
    println(employee1 == employee2)
    println(employee2 == employee3)
    println(employee1.equals(employee2)) // equals and == operators checks structural equality in kotlin
    println(employee2.equals(employee3))
    println("     ")

    println(employee1 === employee2) // checks referential equality. In java we use .equals fn
    println(employee2 === employee3)
    val employee4 = employee3
    println(employee4 === employee3)


//bitwise operators are spelled out
    val x = 0X09080
    val y = 0X4566

    println(x or y )//not x|y

    //instance of

    val something : Any = employee2
    if(something !is Employee){
        //blah
    }
    else {
        //val newEmployee = something as Employee
        //println(newEmployee.name)
        println(something.name)
    }
*/


/*    val number = 25 //val is immutable - cannot be changed after declaration (like final)
    val no: Int
    val nn: Short = 25

    no = 10
    var nu = 13 // var is mutable
    nu = 56


    val employee1 = Employee("Teresa", 456)
    employee1.name = "Teresa Ferguson" // properties can be changed

    //employee1 = Employee ("Tim" , 800) : cant be reassigned

    val employee2: Employee
    val id = 700

    if (id > number)
        employee2 = Employee("Nina", 800)
    else
        employee2 = Employee("Bishop", 89)

    val employees: EmployeeSet*/

}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
      if(obj is Employee)
          return name == obj.name && id == obj.id

     return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}
