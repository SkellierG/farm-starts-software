package com.skellier.stats

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform