fun main() {
   val words = listOf("dinosaur", "limousine", "magazine", "language")
   // Write your code here
   // This loop iterates through the list of words and prints those that start with the letter 'l'
   for(word in words) {
      if(word.startsWith("l")) {
         println(word)
      }
   }
}