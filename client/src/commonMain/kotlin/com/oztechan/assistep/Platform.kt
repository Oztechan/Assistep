package com.oztechan.assistep

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform