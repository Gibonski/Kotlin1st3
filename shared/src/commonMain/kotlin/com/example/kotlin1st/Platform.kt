package com.example.kotlin1st

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform