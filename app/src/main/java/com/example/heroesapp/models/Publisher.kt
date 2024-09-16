package com.example.heroesapp.models

data class Publisher(
    val id: Int,
    val name: String,
    val imageUrl: String
) {
    companion object {
        val publishers = listOf(
            Publisher(1, "Marvel", "https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png"),
            Publisher(2, "DC", "https://upload.wikimedia.org/wikipedia/commons/1/1c/DC_Comics_logo.png")
        )
    }
}
