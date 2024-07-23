//base class init

open class Base(val i: Int)

class Derived : Base
{
    constructor(i: Int) : super(i)

    constructor() : this(9)
}
fun main()
{
    val d1 = Derived(11)
    println(d1.i)

    val d2 = Derived()
    println(d2.i)
}