package classDelegationPkg

interface Controls {
    fun up(velocity : Int) : String
    fun down(velocity : Int) : String
    fun forward(velocity: Int) : String
    fun back(velocity: Int) : String
    fun left(velocity: Int) : String
    fun right(velocity: Int) : String
    fun turboBoost() : String
}
class SpaceShipControls () : Controls {
    override fun turboBoost() = "turbo Boost"
    override fun left(velocity: Int) = "left $velocity"
    override fun down(velocity: Int) = "down $velocity"
    override fun right(velocity: Int) = "right $velocity"
    override fun forward(velocity: Int) = "forward $velocity"
    override fun back(velocity: Int) = "back $velocity"
    override fun up(velocity: Int) = "up $velocity"
}
class ExplicitControls : Controls {
    //creating member object basically creating object
    private val controls = SpaceShipControls()
    override fun turboBoost() = controls.turboBoost()+"Boooooost!"
    override fun back(velocity: Int) = controls.back(velocity)
    override fun left(velocity: Int) = controls.left(velocity)
    override fun right(velocity: Int) = controls.right(velocity)
    override fun forward(velocity: Int) = controls.forward(velocity)
    override fun up(velocity: Int) = controls.up(velocity)
    override fun down(velocity: Int) = controls.down(velocity)
}
fun main()
{
    val controls = ExplicitControls()
    println(controls.up(1000))
    println(controls.turboBoost())
    println(controls.left(1000))
    println(controls.down(1000))
    println(controls.forward(20000))
    println(controls.back(1000))
    println(controls.right(7000))
}