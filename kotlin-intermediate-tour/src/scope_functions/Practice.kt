package scope_functions

class Client() {
  var token: String? = null
  fun connect() = println("connected!")
  fun authenticate() = println("authenticacted!")
  fun getData() : String {
    println("getting data!")
    return "Mock data"
  }

  fun hello() = "Hello!"
}

//data class Person(val name: String, val age: Int)

fun main() {
  val client = Client()
  /*
  client.apply {
    token = "123"
    connect()
    authenticate()
    getData()
  }
   */

  /*
  client.token = "123"
  client.connect()
  client.authenticate()
  client.getData()
   */

  val result = client.run {
    token = "helloworld"
    connect()
    authenticate()
    val cur = getData()
    hello() + cur
  }
  print(result)
}
