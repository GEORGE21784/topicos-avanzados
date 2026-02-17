package com.example.rfc

interface Platform {
   val name: String
}

expect fun getPlatform(): Platform