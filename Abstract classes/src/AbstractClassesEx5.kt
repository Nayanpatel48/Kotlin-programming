interface Parent
{
    val ch : Char
    fun f() : Int
    fun g() = "ch = $ch; f() = ${f()}"
}
class Actual (override val ch : Char) : Parent//1
{
    override fun f() = 17//2
}
class Other : Parent
{
    override val ch: Char //3
        get () = 'B'
    override fun f() = 34//4
}
fun main()
{
    println(Actual('A').g())
    println(Other().g())
}