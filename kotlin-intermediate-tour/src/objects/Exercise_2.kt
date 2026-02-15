package objects

interface Vehicle {
   val name: String
   fun move(): String
}

// Write your code here
object FlyingSkateboard : Vehicle {
   override val name = "Flying Skateboard"
   override fun move() = "Glides through the air with a hover engine"

   fun fly(): String = "Woooooooo"
}

fun main() {
   println("${FlyingSkateboard.name}: ${FlyingSkateboard.move()}")
   // Flying Skateboard: Glides through the air with a hover engine
   println("${FlyingSkateboard.name}: ${FlyingSkateboard.fly()}")
   // Flying Skateboard: Woooooooo
}