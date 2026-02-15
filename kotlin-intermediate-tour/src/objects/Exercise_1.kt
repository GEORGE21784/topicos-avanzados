package objects

interface Order {
   val orderId: String
   val customerName: String
   val orderTotal: Double
}

data object OrderOne: Order {
   override val orderId = "001"
   override val customerName = "Alice"
   override val orderTotal = 15.50
}

// Write your code here
data object OrderTwo: Order {
   override val orderId = "123"
   override val customerName = "Geroge"
   override val orderTotal = 555.4
}

fun main() {
   // Print the name of each data object
   println("Order name: $OrderOne")
   // Order name: OrderOne
   println("Order name: $OrderTwo")
   // Order name: OrderTwo

   // Check if the orders are identical
   println("Are the two orders identical? ${OrderOne == OrderTwo}")
   // Are the two orders identical? false

   if (OrderOne == OrderTwo) {
      println("The orders are identical.")
   } else {
      println("The orders are unique.")
      // The orders are unique.
   }

   println("Do the orders have the same customer name? ${OrderOne.customerName == OrderTwo.customerName}")
   // Do the orders have the same customer name? false
}