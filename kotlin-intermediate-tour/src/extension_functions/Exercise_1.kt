package extension_functions

fun Int.isPositive() = this > 0

fun main() {
  println(123.isPositive())
  // true
}