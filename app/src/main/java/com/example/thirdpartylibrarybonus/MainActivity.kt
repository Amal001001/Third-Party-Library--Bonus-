package com.example.thirdpartylibrarybonus

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var tv:TextView
    lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        button.setOnClickListener { images() }
    }

    fun images(){
        var picturePicker = Random.nextInt(2)
        if (picturePicker == 1) {
            imageView.setImageResource(R.drawable.trick)
            imageView.isVisible = true
            val mp1 = MediaPlayer.create(this, R.raw.trick)
            mp1.start()
        }else{
            imageView.setImageResource(R.drawable.treat)
            imageView.isVisible = true
            val mp2 = MediaPlayer.create(this, R.raw.treat)
            mp2.start()}
    }
}