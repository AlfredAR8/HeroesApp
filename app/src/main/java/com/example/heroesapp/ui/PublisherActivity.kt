package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesapp.R

class PublisherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publisher)

        val marvelButton = findViewById<ImageButton>(R.id.marvelBtn)
        val dcButton = findViewById<ImageButton>(R.id.dcBtn)

        marvelButton.setOnClickListener {
            val intent = Intent(this, HeroesActivity::class.java)
            intent.putExtra("publisherId", 1)
            startActivity(intent)
        }

        dcButton.setOnClickListener {
            val intent = Intent(this, HeroesActivity::class.java)
            intent.putExtra("publisherId", 2)
            startActivity(intent)
        }
    }
}
