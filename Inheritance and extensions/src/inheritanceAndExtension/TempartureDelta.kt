package inheritanceAndExtension

class TemperatureDelta(val current : Double, val target : Double)

//creating extension function
fun TemperatureDelta.heat()
{
    if (current < target)
        println("Heating to $target")
}
//extension function
fun TemperatureDelta.cool1()
{
    if (current > target)
        println("Cooling to $target")
}
fun adjust(delta : TemperatureDelta)
{
    delta.heat()
    delta.cool1()
}
fun main()
{
    adjust(TemperatureDelta(80.0,70.0))
    adjust(TemperatureDelta(70.0,80.0))
}