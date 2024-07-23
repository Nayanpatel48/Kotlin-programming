//redundant abstract modifier in case of interface
interface Redundant
{
    //as you can see because all the properties and member functions are abstract by default inside
    //interface so the abstract modifier is redundant
    abstract val x: Int
    abstract fun f(): Int
    abstract fun g(n: Double)
}
interface Redundant1
{
    //after removing the abstract modifier there is no error
    val x: Int
    fun f(): Int
    fun g(n: Double)
}