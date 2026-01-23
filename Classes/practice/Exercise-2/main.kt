// Defines a Person data class with nested data classes for Name, Address, and City.
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Write your code here
// data class Name(...)
data class Name(val firstName:String, val lastName:String)
data class Address(val st:String, val city:City)
data class City(val name:String, val cc:String)

fun main() {
   val person = Person(
      Name("John", "Smith"),
      Address("123 Fake Street",
      City("Springfield", "US")), ownsAPet = false)
}