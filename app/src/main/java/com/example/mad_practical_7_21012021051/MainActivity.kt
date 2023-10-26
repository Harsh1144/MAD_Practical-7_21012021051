package com.example.mad_practical_7_21012021051

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController = MediaController(this)
        val uri : Uri  = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight )
        val myVideoView = findViewById<VideoView>(R.id.videoview)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val videoView : FloatingActionButton = findViewById(R.id.videoviewbtn)

        videoView.setOnClickListener{
            Intent(this@MainActivity,YoutubeActivity::class.java).also { startActivity(it) }
        }

    }
}