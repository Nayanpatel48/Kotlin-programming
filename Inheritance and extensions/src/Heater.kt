open class Heater
{
    fun heat(temperature : Int) = "heating to $temperature"
}
fun warm(heater: Heater)
{
    println(heater.heat(70))
}
class HVAC : Heater()
{
    fun cool(temperature : Int) = "Cooling to $temperature"
}
fun warmAndCool(hvac : HVAC)
{
    println(hvac.heat(70))
    println(hvac.cool(80))
}
fun main()
{
    val heater = Heater()
    val hvac = HVAC()
    warm(hvac)
    warm(heater)
    warmAndCool(hvac)
}