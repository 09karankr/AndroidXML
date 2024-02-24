package com.example.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer : MediaPlayer
    var totalTime : Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.music)
        mediaPlayer.isLooping = true
        mediaPlayer.setVolume(1f, 1f)
        totalTime = mediaPlayer.duration

        supportActionBar?.hide()

        val btnPlay = findViewById<ImageView>(R.id.play)
        val btnPause = findViewById<ImageView>(R.id.pause)
        val btnStop = findViewById<ImageView>(R.id.stop)
        val seekBarMusic = findViewById<SeekBar>(R.id.seekBar)

        btnPlay.setOnClickListener{
            mediaPlayer.start()
        }
        btnPause.setOnClickListener{
            mediaPlayer.pause()
        }
        btnStop.setOnClickListener{
            mediaPlayer?.stop()
            mediaPlayer.reset()
            mediaPlayer.release()
        }
        // when user changes the time stamp of music, reflect that change
        seekBarMusic.max = totalTime
        seekBarMusic.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
              if(p2){
                  mediaPlayer.seekTo(p1)
              }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        // change the seekbar position based on the music
        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run() {
                try {
                    seekBarMusic.progress = mediaPlayer.currentPosition
                    handler.postDelayed(this, 1000)
                } catch (exception: Exception){
                    seekBarMusic.progress =0
                }

            }

        },0)

    }
}