fun main() {
   var pizzaSlices = 0
   /*pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   println("There's only $pizzaSlices slice/s of pizza :(")
   pizzaSlices++
   */
   // Start refactoring here
   // Using a 'while' loop to replace repetitive code
   while(pizzaSlices < 7) {
      pizzaSlices++
      println("There's only $pizzaSlices slice/s of pizza :(")
   }
   pizzaSlices++
   println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D\n")
   
   // Refactor using a 'do..while' loop
   pizzaSlices = 1
   do {
      println("There's only $pizzaSlices slice/s of pizza :(")
      pizzaSlices++
   } while(pizzaSlices < 8)
   println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D\n")

   // End refactoring here
}