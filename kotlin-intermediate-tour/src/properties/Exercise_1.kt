package properties

fun findOutOfStockBooks(inventory: List<Int>): List<Int>  = buildList {
   // Write your code here
   for(i in 0 until inventory.size)
      if(inventory[i] == 0)
         add(i)
}

fun main() {
   val inventory = listOf(3, 0, 7, 0, 5)
   println(findOutOfStockBooks(inventory))
   // [1, 3]
}