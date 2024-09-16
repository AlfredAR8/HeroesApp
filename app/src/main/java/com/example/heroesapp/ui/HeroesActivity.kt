package com.example.heroesapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero

class HeroesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)

        // Configurar botón de back
        val backButton = findViewById<Button>(R.id.backBtn)
        backButton.setOnClickListener {
            finish()
        }

        // Configurar botón de logout
        val logoutButton = findViewById<Button>(R.id.logoutBtn)
        logoutButton.setOnClickListener {
            // Limpiar el estado de sesión en SharedPreferences
            val sharedPreferences = getSharedPreferences("PREFS", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn", false)
            editor.apply()

            // Redirigir al usuario a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()  // Cierra la actividad actual
        }

        // Obtener el publisherId pasado desde PublisherActivity
        val publisherId = intent.getIntExtra("publisherId", 0)

        // Filtrar la lista de héroes según el publisherId
        val filteredHeroes = Hero.heroes.filter { it.publisherId == publisherId }

        // Configurar el RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.heroesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroAdapter(filteredHeroes)
    }
}
