package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        var newsImageArray = arrayOf(
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6
        )
        val newsHeadingArray = arrayOf(
            "U.K Foreign Secretary james cleverly raises issue of bbc tax searches with eam jaishankar",
            "cooking gas prices hiked by 50 for domestic, 350 for commercial cylinders",
            "joe biden appoints two prominent indian american corporate leaders to his export council",
            "sergey lavrov will raise suspected bombing of nord stream ii at G20: Russian foreign ministry",
            "belarusian leader lukashenko bisits china amid ukraine tensions",
            "china rips new U.s house committee on countering beijing",
            "largest gathering of foreign ministers hosted by any g20 presidency foreign secretary vinay kwatra"

       )

        // to set hav bhaw of items inside recyclerview,vertically scrolling, horizontally, uniform grid
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for (index in newsImageArray.indices){
            val news = News(newsHeadingArray[index], newsImageArray[index])
            newsArrayList.add(news)
        }

    }
}
