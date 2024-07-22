package secondaryConstructor

class GardenItem(val name: String)//primary constructor
{
    var material = name
    var prize = 0
    var category = "empty"
    //secondary / overloaded constructor
    constructor(name: String, prize : Int) : this(name)
    {
        //here this(name) is a call to primary constructor which is required
        material = name
        this.prize = prize
    }
    //secondary / overloaded constructor
    constructor(name : String, prize : Int, category : String) : this(name, prize)
    {
        material = name
        this.prize = prize
        this.category = category
    }
    fun content() : String
    {
        return "Object of $material is created with prize $prize and category $category ."
    }
}
fun main()
{
    val item1 = GardenItem("Rose")//primary constructor invoked
    val item2 = GardenItem("Blossom",2)//secondary / overloaded constructor invoked
    val item3 = GardenItem("Marry",1,"Flower")//secondary / overloaded constructor invoked
    println(item1.content())
    println(item2.content())
    println(item3.content())
}