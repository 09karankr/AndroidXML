package com.example.alertdialoguequiz

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialoguequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Que1.setOnClickListener {
            val options = arrayOf("2","10","11","20")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("How many time zones in Russia?")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }

        binding.Que2.setOnClickListener {
            val options = arrayOf("Lotus","Rose","Jasmine","none")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is the national flower of India?")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }

        binding.Que3.setOnClickListener {
            val options = arrayOf("Procedural","Reusability","Object","Carrot")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle(" The benefits of the object orientation are?")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }
        binding.button.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure to exit?")
            builder1.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()

        }
    }
}