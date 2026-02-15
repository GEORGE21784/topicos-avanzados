package extension_functions

fun String.toLowercaseString() = this.lowercase()

fun main() {
  println("HeLLo WoRld!".toLowercaseString())
  // hello world!
}