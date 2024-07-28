package inheritanceAndExtension

fun Heater.cool(temperature : Int) = "Cooling to $temperature"
fun warmAndCool(heater: Heater)
{
    println(heater.heat(70))
    println(heater.cool(80))
}
fun main()
{
    val tmpHeater = Heater()
    warmAndCool(tmpHeater)
}