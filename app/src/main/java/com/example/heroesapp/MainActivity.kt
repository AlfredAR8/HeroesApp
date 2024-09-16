package com.example.heroesapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesapp.models.User
import com.example.heroesapp.ui.PublisherActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn: Button
    lateinit var emailEt: EditText
    lateinit var passwordEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        val intent = Intent(this@MainActivity, PublisherActivity::class.java)

        if (isLoggedIn) {
            startActivity(intent)
            finish()
        }

        loginBtn = findViewById(R.id.loginBtn)
        emailEt = findViewById(R.id.emailEt)
        passwordEt = findViewById(R.id.passwordEt)

        loginBtn.setOnClickListener {
            Log.i("LOGAPP", "Iniciar Sesión")
            val email = emailEt.text.toString()
            val password = passwordEt.text.toString()
            Log.i("EMAIL", email)
            Log.i("PASSWORD", password)

            if (email.isEmpty() || password.isEmpty()) {
                Log.i("ERROR", "Hay campos vacíos.")
                return@setOnClickListener
            }

            val isValidUser = User.staticUsers.any { user ->
                user.email == email && user.password == password }

            if (!isValidUser) {
                Log.i("ERROR", "Correo o Contraseña Inválidos")
                return@setOnClickListener
            }

            val user = User.staticUsers.firstOrNull {
                it.email == email && it.password == password
            }
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn", true)
            editor.putString("userEmail", user?.email)
            editor.apply()
            startActivity(intent)
            finish()
        }
    }
}