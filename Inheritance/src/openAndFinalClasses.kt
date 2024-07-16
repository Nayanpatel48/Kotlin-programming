open class Parent
class Child : Parent()

//the Child class is not open so this will fails:
//class GrandChild : Child()

//this class can't be inherited
final class Single

//same as using final:
class AnotherSingle