//base class secondary constructor invocation

open class House(
    //all the class members / properties
    var address : String,
    var rent : Int,
    var state : String
)
{
    var fullAddress : String = ""

    //secondary constructor
    constructor(
        address : String,
        rent : Int,
        state : String,
        fullAddress : String
    ) : this(address, rent,state)
    {
        this.address=address
        this.state=state
        this.rent=rent
        this.fullAddress=fullAddress
    }
}
class VacationHouse(
    //all the class members / properties
    address : String,
    rent : Int,
    state : String,
    val startMonth: String,
    val endMonth: String,
    fullAddress: String,
    ) : House(address,rent,state, fullAddress)
{
    override fun toString(): String
    {
        return "VacationHouse has address = $address , rent = $rent , state = $state " +
                "Starting month is $startMonth & ending month is $endMonth fullAddress $fullAddress."
    }
}
fun main()
{
    val obj1 = VacationHouse("Aranala", 67000,"Gujarat","January","April"," null ")
    println(obj1.toString())
}