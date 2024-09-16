package com.example.heroesapp.models

data class Publisher(
    val id: Int,
    val name: String,
    val image: String
) {
    companion object {
        val publishers = listOf(
            Publisher(1, "Marvel", "https://example.com/marvel-logo.jpg"),
            Publisher(2, "DC", "https://example.com/dc-logo.jpg")
        )
    }
}
