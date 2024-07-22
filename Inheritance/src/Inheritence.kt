open class A
{
    var count : Int = 0

    open fun increment()
    {
        count++
    }
    open fun decrement()
    {
        count--
    }
    fun change(value : Int)
    {
        count=value
    }
}
class B : A()//B inherited from A
{
    override fun decrement()
    {
        count= count - 10
        super.decrement()
    }
    override fun increment()
    {
        count = count + 10
        super.increment()
    }
    //Add a function
    fun bMessage() = "I am B!"
}
class C : A()//C inherited from A
{
    val extraCount = 10

    override fun decrement()
    {
        count=count-extraCount
        super.decrement()
    }
    override fun increment()
    {
        count=count+extraCount
        super.increment()
    }
}
fun main()
{
    val obj1 = B()
    val obj2 = C()

    obj1.increment()
    println(obj1.count)

    obj1.decrement()
    println(obj1.count)

    println(obj2.count)
    obj2.change(56)
    println(obj2.count)
}