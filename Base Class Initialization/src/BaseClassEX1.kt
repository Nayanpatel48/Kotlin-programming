open class A(
    val name : String,
    val rollNumber : Int
)
open class B(
    val newName : String,
    val newRollNumber: Int
) : A(newName,newRollNumber)
//extension function
fun A.info() = "name = $name & roll number $rollNumber"
fun main()
{
    val obj1 = B("Nayan",48)
    println(obj1.info())
}