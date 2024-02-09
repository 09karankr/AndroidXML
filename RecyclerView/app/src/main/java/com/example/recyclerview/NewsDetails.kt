package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val heading = intent.getStringExtra("heading")
        val newsContent =intent.getStringExtra("newscontent")
        val imageId = intent.getIntExtra("imageId",R.drawable.pic1)

        val headingTV = findViewById<TextView>(R.id.newsHeading)
        val headingIV = findViewById<ImageView>(R.id.newsImage)
        val newsContentTV = findViewById<TextView>(R.id.newsContent)

        headingTV.text = heading
        newsContentTV.text = newsContent
        headingIV.setImageResource(imageId)
    }
}