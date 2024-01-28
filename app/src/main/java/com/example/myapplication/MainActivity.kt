package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onAnyButtonClick()
    }
    fun onAnyButtonClick() {
        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.password)
        val btn = findViewById<Button>(R.id.signInBtn)
        val btnBottom = findViewById<View>(R.id.buttomBtn)

        btn.setOnClickListener {
            val loginText = login.text.toString()
            val passwordText = password.text.toString()

            if(loginText == "nikita2007pro" && passwordText == "123123") {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            else if(loginText == "yarik" && passwordText == "123123") {
                val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
                val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, maxVolume, 0)

                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(
                    applicationContext,
                    "Неверные данные!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnBottom.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}


