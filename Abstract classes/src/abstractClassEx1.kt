abstract class WithProperty
{
    //abstract keyword is required as long as there is no initialization in the property
    abstract val x :Int
}
abstract class WithFunction
{
    abstract fun g() : Int
    abstract fun f(x : Int)
}