// Defines an Employee data class and functions to retrieve employee salary
// by ID, handling null values safely. It then sums the salaries of employees with IDs from 1 to 5, 
// treating non-existent employees as having a salary of 0.
data class Employee (val name:String, var salary:Int)

fun employeeById(id: Int) = when(id) {
   1 -> Employee("Luis", 7)
   2 -> null
   3 -> Employee("George", 10)
   4 -> Employee("Shanty", 20)
   else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
   println((1..5).sumOf { id -> salaryById(id) })
}