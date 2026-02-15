package libraries_and_APIs

// Write your code here
import kotlin.math.*
fun calculateCompoundInterest(P: Double, r: Double, n: Int, t: Int): Double =
   P * (1 + r / n).pow(n * t)

fun main() {
   val principal = 1000.0
   val rate = 0.05
   val timesCompounded = 4
   val years = 5
   val amount = calculateCompoundInterest(principal, rate, timesCompounded, years)
   println("The accumulated amount is: $amount")
   // The accumulated amount is: 1282.0372317085844
}