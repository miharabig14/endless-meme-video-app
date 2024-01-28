package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    var mMediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        onButtonClick()
    }
    fun onButtonClick() {
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.gav)
                mMediaPlayer!!.start()
            } else mMediaPlayer!!.start()

        }
    }
}