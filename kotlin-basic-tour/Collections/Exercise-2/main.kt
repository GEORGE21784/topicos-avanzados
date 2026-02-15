fun main() {
   val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
   val requested = "smtp"
   // Write your code here 
   val isSupported = requested in SUPPORTED // This line checks if the 'requested' protocol is in the 'SUPPORTED' set
   println("Support for $requested: $isSupported")
}