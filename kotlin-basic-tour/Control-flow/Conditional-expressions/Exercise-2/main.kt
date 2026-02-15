fun main() {
   val button = "A"

   println(
      // Write your code here
      // This block uses a 'when' expression to map button labels to their corresponding actions or messages
      when(button) {
         "A" -> "Yes"
         "B" -> "No"
         "X" -> "Menu"
         "Y" -> "Nothing"
         else -> "There is no such button"
      }
   )
}