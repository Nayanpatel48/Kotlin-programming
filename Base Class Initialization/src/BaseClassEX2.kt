//invoking base class constructor

open class Class1 (val value1 : Int, val value2 : Int)
class Class2 (val newValue1 : Int, val newValue2 : Int) : Class1(newValue1, newValue2)

open class Class3 (val value3 : Int, val value4 : Int)
class Class4 (val newValue3 : Int, val newValue4 : Int) : Class3(newValue3, newValue4)

//extension functions
fun Class1.info() = "value1 = $value1 & value2 = $value2"

fun Class3.info() = "value3 = $value3 & value4 = $value4"

fun main()
{
    val obj1 = Class2(2,3)
    val obj2 = Class4(90,7)

    println(obj1.info())
    println(obj2.info())
}