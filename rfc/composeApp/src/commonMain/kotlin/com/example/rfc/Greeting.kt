package com.example.rfc

class Greeting {
   private val platform = getPlatform()

   fun greet(): String {
      return "Hello, ${platform.name}!"
   }
}