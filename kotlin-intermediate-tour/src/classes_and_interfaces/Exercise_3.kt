package classes_and_interfaces

interface Refundable {
   // Write your code here
   fun refund(amount: Double)
}

abstract class PaymentMethod(val name: String) {
   // Write your code here
   fun authorize(amount: Double) =
      println("Authorizing payment of $$amount.")

   abstract fun processPayment(amount: Double)
}
// Write your code here
class CreditCard(name: String) : PaymentMethod(name), Refundable {
   override fun processPayment(amount: Double) {
      println("Processing credit card payment of $$amount.")
   }

   override fun refund(amount: Double) {
      println("Refunding $$amount to the credit card.")
   }
}

fun main() {
   val visa = CreditCard("Visa")

   visa.authorize(100.0)
   // Authorizing payment of $100.0.
   visa.processPayment(100.0)
   // Processing credit card payment of $100.0.
   visa.refund(50.0)
   // Refunding $50.0 to the credit card.
}