// Calculates the total number of seconds in a time interval, given hours, minutes, and seconds.
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {
   return ((hours * 60) + minutes) * 60 + seconds
}

fun main() {
   // Call the intervalInSeconds function with different combinations of arguments to demonstrate its usage.
   println(intervalInSeconds(1, 20, 15))
   println(intervalInSeconds(minutes = 1, seconds = 25))
   println(intervalInSeconds(hours = 2))
   println(intervalInSeconds(minutes = 10))
   println(intervalInSeconds(hours = 1, seconds = 1))
}