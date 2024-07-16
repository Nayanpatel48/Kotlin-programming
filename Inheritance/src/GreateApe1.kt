open class GreatApe
{
    val weight = 100.00
    val age = 12
    fun info() = "wt : $weight age : $age"
}
open class Bonobo : GreatApe()
class Chimpanzee : GreatApe()
class BonoboB : Bonobo()

fun main()
{
    //you can also call info() on a Bonobo, a Chimpanzee, or a BonoboB!
    //Even though the latter three are distinct types
    println(GreatApe().info())
    println(Bonobo().info())
    println(Chimpanzee().info())
    println(BonoboB().info())
}