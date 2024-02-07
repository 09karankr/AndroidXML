package com.example.listviewproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
//import java.util.ArrayList
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Saumya", "Karan","Ankit","Pradeep","Aman")
        val lastMsg = arrayOf("Hey Wassup","I am fine","Awesome","cool","wtf")
        val lastMsgTime = arrayOf("6:29 AM","05:22 PM","10:00 PM","6:29 AM","05:22 PM")
        val phoneNumber = arrayOf("854944045","8690044875","659030322","904560493","938485943")
        val imgId = intArrayOf(R.drawable.pic5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4)

        userArrayList = ArrayList()

        for (eachIndex in name.indices){
            val user = User(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])

            userArrayList.add(user)
        }
        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val userName = name[i]
            val userPhone = phoneNumber[i]
            val imageId = imgId[i]

            val i = Intent(this,UserActivity::class.java)

            i.putExtra("name", userName)
            i.putExtra("phone",userPhone)
            i.putExtra("imageId",imageId)
            startActivity(i)



        }

    }
}