fun main() {
   val actions = listOf("title", "year", "author")
   val prefix = "https://example.com/book-info"
   val id = 5
   // Write your code here
   // Create the list of URLs mapping each action to its URL where it is appended to the prefix and id
   val urls = actions.map {it -> "$prefix/$id/$it"}
   println(urls.joinToString("\n"))
}