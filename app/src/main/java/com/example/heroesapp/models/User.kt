package com.example.heroesapp.models

data class User(val email: String, val password: String, val name: String){
    //    Variable estática que permite acceder a ella sin instanciar un objeto
    companion object{
        val staticUsers = listOf(
            User(email = "user1@correo.com", password = "1234", "Usuario1"),
            User(email = "user2@correo.com", password = "1234", "Usuario2"),
            User(email = "user3@correo.com", password = "1234", "Usuario3"),
            User(email = "alfred@correo.com", password = "1234", "Alfred")
        )
    }
}
