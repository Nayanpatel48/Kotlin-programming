class Engine
{
    fun start() = "Engine start!"
    fun stop() = "Engine stop!"
}
class Wheel
{
    fun inflate(psi : Int) = "wheel inflate $psi"
}
class Window(val side : String)
{
    fun rollUp() = "$side will rollUp"
    fun rollDown() = "$side will rollDown"
}
class Door(val side : String)
{
    //existing class object is created here
    val window = Window(side)
    fun open() = "$window side door open."
    fun close() = "$window side door close"
}
class Car
{
    //creating engine
    val engine = Engine()
    val wheel = List(4) { Wheel() }

    //Two doors left and right door
    val leftDoor= Door("Left")
    val rightDoor= Door("Right")
}
fun main()
{
    val car = Car()

    println(car.engine.stop())

    println(car.leftDoor.open())
    println(car.rightDoor.open())

    println(car.leftDoor.close())
    println(car.rightDoor.close())

    println(car.leftDoor.window.rollDown())
    println(car.rightDoor.window.rollDown())

    println(car.leftDoor.window.rollUp())
    println(car.rightDoor.window.rollUp())

    println(car.wheel[0].inflate(56))

    println(car.engine.start())
}