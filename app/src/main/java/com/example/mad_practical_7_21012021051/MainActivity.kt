package com.example.mad_practical_7_21012021051

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView: VideoView = findViewById(R.id.myvideo)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setMediaController(mediaController)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val switchButton: FloatingActionButton = findViewById(R.id.switch_btn)

        switchButton.setOnClickListener() {
            Intent(this@MainActivity, YoutubeActivity::class.java).also { startActivity(it) }
        }
}
}