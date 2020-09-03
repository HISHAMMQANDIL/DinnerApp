package com.example.dinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide.setOnClickListener {
// Change the Label Text
            food.text = " ${list.random()}!"

        }

        addfood.setOnClickListener{
            val element = newfood.text
            list.add(element.toString())
        }

    }
    val list = arrayListOf( "Hamburger", "Pizza",
        "Mexican", "American", "Chinese")




}