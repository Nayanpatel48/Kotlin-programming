class X
fun X.f() {
    println("A")
}

class Y
fun Y.f() {
    println("B")
}

fun callF(x: X) = x.f()
fun callF(y: Y) = y.f()

fun main()
{
    val x = X()
    val y = Y()
    x.f()
    y.f()
    callF(x)
    callF(y)
}