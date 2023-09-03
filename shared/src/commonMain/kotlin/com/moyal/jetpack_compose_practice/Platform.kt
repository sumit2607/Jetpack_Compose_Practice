package com.moyal.jetpack_compose_practice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform