package lambda_expressions_with_receiver

fun fetchData(callback: StringBuilder.() -> Unit) {
   val builder = StringBuilder("Data received")
   builder.callback()
}

fun main() {
   fetchData {
      // Write your code here
      // Data received - Processed
      append(" - Processed")
      print(this)
   }
}