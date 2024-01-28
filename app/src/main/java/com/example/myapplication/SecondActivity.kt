package com.example.myapplication

import android.content.Context
import android.media.AudioManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val video = findViewById<View>(R.id.videoView) as VideoView
        video!!.setVideoURI(
            Uri.parse("android.resource://"
                + packageName + "/" + R.raw.video))

        video.start()

        video.setOnCompletionListener {
            video.start()
        }
    }
}