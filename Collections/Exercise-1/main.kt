fun main() {
   val greenNumbers = listOf(1, 4, 23)
   val redNumbers = listOf(17, 2)
   // Write your code here
   // Explain this line
   val totalCount = greenNumbers.count() + redNumbers.count() 
   // This line calculates the total number of elements in both lists
   // The count() function returns the number of elements in a collection.
   println("Total number of elements: $totalCount")
}