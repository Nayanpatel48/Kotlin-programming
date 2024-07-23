class IntList(val name : String)
{
    val list = mutableListOf<Int>()
}
fun main()
{
    val obj1 = IntList("Nayan")
    println(obj1.name)
    obj1.list += 7 //adds the 7 into the list
    obj1.list += 0 //adds the 0 into the list
    println(obj1.list)
}