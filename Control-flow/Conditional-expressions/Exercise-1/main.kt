import kotlin.random.Random

fun main() {
   val firstResult = Random.nextInt(6)
   val secondResult = Random.nextInt(6)
   // Write your code here
   // Determines if the two random numbers are equal and assigns a corresponding message to 'ans'
   val ans:String
   if(firstResult == secondResult) {
      ans = "You win :)"
   } else {
      ans = "You lose :("
   }
   println(ans)
}