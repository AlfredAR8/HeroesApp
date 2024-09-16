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
import com.example.heroesapp.models.Publisher

class PublisherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publisher)

        // Configurar el botón de logout
        val logoutButton = findViewById<Button>(R.id.logoutBtn)
        logoutButton.setOnClickListener {
            val sharedPreferences = getSharedPreferences("PREFS", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn", false)
            editor.apply()

            // Redirigir al usuario a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }

        // Obtener la lista de publishers
        val publishers = Publisher.publishers

        // Configurar el RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.publisherRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Crear el adaptador y manejar el evento de clic
        val adapter = PublisherAdapter(publishers) { publisher ->
            val intent = Intent(this, HeroesActivity::class.java)
            intent.putExtra("publisherId", publisher.id)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}
