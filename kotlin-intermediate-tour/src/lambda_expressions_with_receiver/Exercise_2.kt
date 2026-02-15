package lambda_expressions_with_receiver

class Button {
   fun onEvent(action: ButtonEvent.() -> Unit) {
      // Simulate a double-click event (not a right-click)
      val event = ButtonEvent(isRightClick = false, amount = 2, position = Position(100, 200))
      event.action() // Trigger the event callback
   }
}

data class ButtonEvent(
   val isRightClick: Boolean,
   val amount: Int,
   val position: Position
)

data class Position(
   val x: Int,
   val y: Int
)

fun main() {
   val button = Button()

   button.onEvent {
      // Write your code here
      if(!isRightClick && amount == 2) {
         print("Double click!")
      }
      // Double click!
   }
}