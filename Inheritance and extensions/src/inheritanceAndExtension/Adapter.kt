package inheritanceAndExtension

open class MyClass
{
    fun g() = println("g()")
    fun h() = println("f()")
}
fun useMyClass(mc : MyClass)
{
    mc.g()
    mc.h()
}
class MyClassAdaptedForLib : MyClass()
{
    fun f1() = h()
    fun f2() = g()
}
fun main()
{
    val mc = MyClassAdaptedForLib()
    mc.h()
    mc.g()
    mc.f2()
    mc.f1()
    useMyClass(mc)
}