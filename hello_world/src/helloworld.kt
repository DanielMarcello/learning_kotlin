import com.shreks.Person

/*
 multiline comentary
 */
fun main(args: Array<String>){ //comentary
    /*var int_number = 10
    println(int_number)
    int_number = 666
    println(int_number)

    var string_dec2: String
    string_dec2 = "Hello"
    println(string_dec2)
    string_dec2 = "World!"
    println(string_dec2)*/

    var personobj = Person("Daniel", "Salinas")
    personobj.display_name()
    personobj.display_fullname()
}