open class Pet
{
    open fun speak()  = "Pet"
}
class Dog : Pet()
{
    override fun speak() = "Bow!"
}
class Cat : Pet()
{
    override fun speak() = "meow!"
}
fun talk (pet : Pet) = println(pet.speak())
fun main()
{
    talk(Dog())
    talk(Cat())
}