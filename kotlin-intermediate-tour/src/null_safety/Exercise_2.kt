package null_safety

data class Subscription(val name: String, val isActive: Boolean)
// Write your code here
fun getActiveSubscription(subscriptions: List<Subscription>): Subscription? =
   subscriptions.singleOrNull { it.isActive }

fun main() {
   val userWithPremiumPlan = listOf(
      Subscription("Basic Plan", false),
      Subscription("Premium Plan", true)
   )

   val userWithConflictingPlans = listOf(
      Subscription("Basic Plan", true),
      Subscription("Premium Plan", true)
   )

   println(getActiveSubscription(userWithPremiumPlan))
   // Subscription(name=Premium Plan, isActive=true)

   println(getActiveSubscription(userWithConflictingPlans))
   // null
}