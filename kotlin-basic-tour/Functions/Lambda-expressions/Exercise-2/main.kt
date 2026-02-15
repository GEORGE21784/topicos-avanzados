// Write your code here
fun rep(n: Int, action: () -> Unit) {
   for(i in 0 until n) action()
}

fun main() {
   // Write your code here
   // The 'rep' function takes an integer 'n' and a lambda 'action' as parameters. It executes the 'action' lambda 'n' times using a for loop.
   rep(5) {
      println("Hello")
   }
}