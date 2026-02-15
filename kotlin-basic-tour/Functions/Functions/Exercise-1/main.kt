import kotlin.math.PI

// Write your code here
// Calculates the area of a circle given its radius 'r'
fun circleArea(r: Int): Double {
   return PI * r * r
}

fun main() {
   println(circleArea(2))
}