package com.kmp.emojihub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform