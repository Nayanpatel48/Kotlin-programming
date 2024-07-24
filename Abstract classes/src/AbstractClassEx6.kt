interface PropertyAccessor
{
    val a: Int
        get() = 11
}

class Impl : PropertyAccessor

fun main()
{
    println(Impl().a)//11
}